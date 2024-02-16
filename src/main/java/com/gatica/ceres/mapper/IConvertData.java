package com.gatica.ceres.mapper;

public interface IConvertData {

    <T> T convertJson(String json,Class<T> classObject);
}
