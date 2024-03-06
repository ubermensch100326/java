package main.java.ch16.ex05;

import main.java.ch16.ex05.Member;
@FunctionalInterface
public interface Creatable2 {
    public Member create(String id, String name);
}
