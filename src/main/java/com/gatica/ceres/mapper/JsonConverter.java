package com.gatica.ceres.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class JsonConverter implements IConvertData{

    private ObjectMapper objectMapper;


    @Override
    public <T> T convertJson(String json, Class<T> classObject) {
        try{
            return objectMapper.readValue(json,classObject);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }

    }
}
