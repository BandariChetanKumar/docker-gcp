package com.bmg.vault.list;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VaultListController.class)
public class VaultListControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VaultListService service;

    @Test
    public void getByUidShouldBeReturnVaultListFromService() throws Exception, VaultListNotFoundException {
        String uid = "songs";
        VaultList vaultList = new VaultList();
        vaultList.setDescription("test");
        vaultList.setUid("uid");
       // when(service.getByUid(uid)).thenReturn(vaultList);
        String contentAsString = this.mockMvc.perform(get("/api/lists/" + uid)
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print()).andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
        assertThat(contentAsString.contains(vaultList.getUid()));
    }

}
