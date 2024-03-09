package main.java.ch18.ex06;

import java.io.Serializable;

public class Product implements Serializable {

    // serialVersionUID 값은 개발자가 임의로 줄 수 있지만, 가능하다면 클래스마다 다른 유일한 값을 갖도록 하는 것이 좋음
    // 서로 다른 개발자가 같이 개발할 때 클래스의 serialVersionUID 값이 같으면 직렬화 가능함
    
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}
