package com.example.cobeosijek.nkkutjevo.data_objects;

public class ImageModel extends BaseModel {

    private String uri;

    public ImageModel(String uri) {
        this.uri = uri;
    }

    public ImageModel() {
    }

    public String getUri() {
        return returnValueOrEmpty(uri);
    }
}
