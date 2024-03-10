package main.java.ch19.ex03;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerExample {

    private static ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {
        System.out.println("현재 스레드: " + Thread.currentThread().getName());
        startServer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String line = br.readLine();
                if (line.equals("q")) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        br.close();

        stopServer();
    }

    /*
     * TCP 서버 시작
     */
    public static void startServer() {
        /*
         * 작업 스레드 정의
         * 메인 스레드에서는 q가 입력됐는지를 확인하고 종료시켜야 함
         * 그렇기 때문에 서버를 시작하는 작업은 별도의 스레드에서 수행해야 함
         */
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("서버 시작");
                    
                    // 여러 클라이언트의 요청을 수락하기 위해 while문 사용
                    while (true) {
                        System.out.println("현재 스레드: " + Thread.currentThread().getName());
                        System.out.println("연결 기다림");
                        // 여기서 블로킹되어 클라이언트의 연결 요청을 기다림
                        Socket socket = serverSocket.accept();
                        System.out.println("연결 수락함");
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("연결 from " + isa.getHostString() + ":" + isa.getPort());

                        System.out.println("=====================================");
                        /*
                         * 클라이언트로부터 데이터를 받음
                         */
                        System.out.println("데이터 받기 시작");

                        InputStream is = socket.getInputStream();
//                        BufferedInputStream bis = new BufferedInputStream(is);
//                        byte[] bytes = new byte[1024];
//                        int readByteCount = bis.read(bytes);
//                        String message = new String(bytes, 0, readByteCount, "UTF-8");
                        DataInputStream dis = new DataInputStream(is);
                        String message = dis.readUTF();

                        System.out.println("데이터 받기 성공: " + message);

                        System.out.println("=====================================");
                        /*
                         * 클라이언트로 데이터를 보냄
                         */
                        OutputStream os = socket.getOutputStream();
//                        BufferedOutputStream bos = new BufferedOutputStream(os);
//                        byte[] sendBytes = message.getBytes("UTF-8");
//                        bos.write(sendBytes);
//                        bos.flush();

                        DataOutputStream dos = new DataOutputStream(os);
                        dos.writeUTF(message);
                        System.out.println("데이터 보내기 성공");

                        // 연결 끊기
                        socket.close();
                        System.out.println("연결 끊김 from " + isa.getHostString() + ":" + isa.getPort());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }

    public static void stopServer() {
        // 서버 소켓 닫기
        try {
            serverSocket.close();
            System.out.println("서버 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
