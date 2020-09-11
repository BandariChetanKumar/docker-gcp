package com.bmg.vault.list;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VaultListService {

    @Autowired
    private VaultListRepository vaultListRepository;

    @Transactional(readOnly = true)
    public VaultList getByUid(String uid) throws VaultListNotFoundException{
        VaultList vaultList = null;
        if (StringUtils.isNumeric(uid)) {
            vaultList = vaultListRepository.findById(Long.parseLong(uid)).orElse(null);
        } else {
            vaultList = vaultListRepository.findByUid(uid);
        }
        if (vaultList != null){
            return vaultList;
        }
        throw new VaultListNotFoundException("List not found");
    }
}
