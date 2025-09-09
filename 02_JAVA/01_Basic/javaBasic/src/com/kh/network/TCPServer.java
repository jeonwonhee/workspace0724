package com.kh.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    /*
     * TCP
     * - 서버, 클라이언트와 1:1 소켓통신
     * - 데이터를 교환하기에 앞서 서버, 클라이언트 연결이 되어있어야한다.
     * 
     * (서버가 먼저 실행되어있어야 클라이언트의 연결요청을 받을 수 있음)
     * 
     * socket
     * - 프로세스 간에 통신을 담당
     * - input/outputStream을 가지고 있음(해당 스트림을 통해 데이터를 입출력 가능)
     * 
     * ServerSocket
     * - 포트와 연결되어 외부의 연결요청을 기다림 -> 요청이 들어오면 수락
     *   수락 -> 통신할 수 있는 socket 생성
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        PrintWriter pw = null;

        // 1) 포트번호 지정
        int port = 3001;

        try {
            // 2) ServerSocket 객체 생성
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("클라이언트 요청을 기다립니다...");

            // 3) 클라이언트 연결 요청 대기 후 수락
            Socket socket = serverSocket.accept();

            InetAddress clientIp = socket.getInetAddress();
            System.out.println(clientIp.getHostAddress() + " 가 연결을 요청함...");

            // 4) 스트림 준비
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true); // autoFlush = true

            String message;
            // 5) 클라이언트와 주고받기
            while (true) {
                // 클라이언트 메시지 받기
                message = br.readLine();
                if (message == null || message.equalsIgnoreCase("exit")) {
                    System.out.println("클라이언트가 연결을 종료했습니다.");
                    break;
                }
                System.out.println("클라이언트 : " + message);

                // 서버에서 클라이언트로 보내기
                System.out.print("서버 : ");
                String sendMsg = sc.nextLine();
                pw.println(sendMsg);

                if (sendMsg.equalsIgnoreCase("exit")) {
                    System.out.println("서버가 연결을 종료했습니다.");
                    break;
                }
            }

            // 6) 자원 반납
            br.close();
            pw.close();
            socket.close();
            serverSocket.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
