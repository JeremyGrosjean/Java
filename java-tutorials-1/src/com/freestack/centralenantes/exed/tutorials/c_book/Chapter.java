package com.freestack.centralenantes.exed.tutorials.c_book;

public class Chapter {

    private int page;
    private String name;
    private String content;

    public Chapter(String name, int page) {
        this.page = page;
        this.name = name;
    }

    public Chapter(String name, String content) {
        this.page = page;
        this.name = name;
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public Chapter setPage(int number) {
        this.page = number;
        return this;
    }

    public String getName() {
        return name;
    }

    public Chapter setName(String name) {
        this.name = name;
        return this;
    }
}
