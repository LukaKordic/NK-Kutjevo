package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

public class FeedResponse {
    private GraphObject graphObject;

    private static class GraphObject {
        private Data data[];

        private static class Data {
            private String name;
            private String story;
            private String full_picture;
        }
    }
}
