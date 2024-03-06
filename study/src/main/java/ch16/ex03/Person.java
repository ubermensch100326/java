package main.java.ch16.ex03;

public class Person {

    public void action(Calculable calculable) {
        double result = calculable.calculate(3.5, 5.3);
        System.out.println("result: " + result);
    }
}
