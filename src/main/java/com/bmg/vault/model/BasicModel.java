package com.bmg.vault.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.MappedSuperclass;
import java.util.Map;

@MappedSuperclass
public abstract class BasicModel extends BaseModel implements Jsonifyable {
    protected static ObjectMapper mapper = new ObjectMapper();

    @Override
    public Map serializeToMap() {
        return mapper.convertValue(this, Map.class);
    }
}
