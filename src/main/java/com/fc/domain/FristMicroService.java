package com.fc.domain;

public class FristMicroService {

    private final long id;
    private final String content;

    public FristMicroService(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
