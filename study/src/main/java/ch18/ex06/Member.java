package main.java.ch18.ex06;

import java.io.Serializable;

public class Member implements Serializable {

    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
