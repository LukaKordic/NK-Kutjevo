package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

import java.util.ArrayList;
import java.util.List;

public class GraphObject {
    private List<Data> dataList = new ArrayList<>();

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public GraphObject(List<Data> dataList) {
        this.dataList = dataList;
    }
}
