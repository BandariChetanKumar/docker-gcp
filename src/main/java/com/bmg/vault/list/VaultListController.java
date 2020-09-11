package com.bmg.vault.list;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lists")
public class VaultListController {

    @Autowired
    private VaultListService vaultListService;


    @Operation(summary = "Get a list by its uid")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the list",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = VaultList.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid uid supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "List not found", content = @Content) })
    @GetMapping("/{uid}")
    public VaultList getByUid(@PathVariable String uid) throws VaultListNotFoundException {
        return  vaultListService.getByUid(uid);
    }
}
