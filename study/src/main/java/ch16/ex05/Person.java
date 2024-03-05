package main.java.ch16.ex05;

import main.java.ch16.ex05.Calculable;

public class Person {

    public void action(Calculable calculable) {
        double result = calculable.calculate(3.5, 5.3);
        System.out.println("result: " + result);
    }
}
