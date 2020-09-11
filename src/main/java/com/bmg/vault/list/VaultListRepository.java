package com.bmg.vault.list;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaultListRepository extends CrudRepository<VaultList, Long> {
    VaultList findByUid(String uid);
}
