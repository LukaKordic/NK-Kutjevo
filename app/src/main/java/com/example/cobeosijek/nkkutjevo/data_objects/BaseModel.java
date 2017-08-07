package com.example.cobeosijek.nkkutjevo.data_objects;


public class BaseModel {

    protected String returnValueOrEmpty(String value) {
        return (value == null) ? "" : value;
    }
}
