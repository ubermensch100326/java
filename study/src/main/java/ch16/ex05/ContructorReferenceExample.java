package main.java.ch16.ex05;

public class ContructorReferenceExample {

    public static void main(String[] args) {
        Person person = new Person();

        // 1

        // 익명 클래스 이용
        Member m1 = person.getMember1(new Creatable1() {
            @Override
            public Member create(String id) {
                return new Member(id + "1");
            }
        });
        System.out.println(m1.toString());

        // 람다식 이용
        Member m2 = person.getMember1(id -> new Member(id + "2"));
        System.out.println(m2.toString());

        // 생성자 참조 이용
        Member m3 = person.getMember1(Member::new);
        System.out.println(m3.toString());


        // 2

        // 익명 클래스 이용
        Member m4 = person.getMember2(new Creatable2() {
            @Override
            public Member create(String id, String name) {
                return new Member(id + "1", name + "1");
            }
        });
        System.out.println(m4.toString());

        // 람다식 이용
        Member m5 = person.getMember2((id, name) -> new Member(id + "2", name + "2"));
        System.out.println(m5.toString());

        // 생성자 참조 이용
        Member m6 = person.getMember2(Member::new);
    }
}
