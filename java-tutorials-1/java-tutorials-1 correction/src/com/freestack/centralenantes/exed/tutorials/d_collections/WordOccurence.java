package com.freestack.centralenantes.exed.tutorials.d_collections;

public class WordOccurence {

    private String value;
    private int occurence;

    public String getValue() {
        return value;
    }

    public WordOccurence(String value, int occurence) {
        this.value = value;
        this.occurence = occurence;
    }

    public WordOccurence setValue(String value) {
        this.value = value;
        return this;
    }

    public int getOccurence() {
        return occurence;
    }

    public WordOccurence setOccurence(int occurence) {
        this.occurence = occurence;
        return this;
    }



}
