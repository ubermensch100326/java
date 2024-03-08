package main.java.ch17.ex08;

public class Student {

    private String name;
    private String sex;
    private int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름: ").append(name).append(", ");
        sb.append("성별: ").append(sex).append(", ");
        sb.append("나이: ").append(age);
        return sb.toString();
    }
}
