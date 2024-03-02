package main.java.ch12.ex02;

import java.lang.reflect.Method;
import java.util.Arrays;

public class PrintAnnotationExample {

    public static void main(String[] args) {
        // Reflection을 하기 위해 Service 클래스의 메서드 목록을 가져옴
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
                System.out.println("[" + method.getName() + "]");
                printLine(printAnnotation);
                try {
                    method.invoke(new Service());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                printLine(printAnnotation);
            }
        }

        System.out.println("=================================");

        Arrays.stream(declaredMethods).forEach(method -> {
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
                System.out.println("[" + method.getName() + "]");
                printLine(printAnnotation);
                try {
                    method.invoke(new Service());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                printLine(printAnnotation);
            }
        });
    }

    // PrintAnnotation에 맞게 출력하는 메서드
    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation == null) {
            return;
        }
        int number = printAnnotation.number();
        String value = printAnnotation.value();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(value);
        }
        System.out.println(sb);
    }
}
