package main.java.ch19.ex02;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.9", 50001);
        } catch (UnknownHostException e) {
            System.out.println("1");
            // 서버의 IP 주소가 잘못되었을 경우
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("2");
            // 서버가 실행 중이지 않을 경우
            e.printStackTrace();
        }

    }
}
