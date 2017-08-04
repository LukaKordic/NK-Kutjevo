package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

public class FeedResponse {
    private GraphObject graphObject;

    public FeedResponse(GraphObject graphObject) {
        this.graphObject = graphObject;
    }

    public GraphObject getGraphObject() {
        return graphObject;
    }

    public void setGraphObject(GraphObject graphObject) {
        this.graphObject = graphObject;
    }
}