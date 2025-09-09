package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TPCClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = null;
        PrintWriter pw = null;
        Socket socket = null;

        // 요청하고자 하는 서버의 위치 (IP + port)
        String serverIP = "192.168.10.21"; // ← 공백 제거
        int port = 3001;

        try {
            // 1) 서버로 연결 요청
            socket = new Socket(serverIP, port);
            if (socket != null) {
                System.out.println("서버와 연결 성공!");

                // 입력용 스트림 (서버 → 클라이언트)
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // 출력용 스트림 (클라이언트 → 서버)
                pw = new PrintWriter(socket.getOutputStream(), true); // autoFlush = true

                // 메시지 송수신 루프
                while (true) {
                    // 클라이언트 → 서버
                    System.out.print("서버로 보낼 내용: ");
                    String sendMessage = sc.nextLine();
                    pw.println(sendMessage);

                    if (sendMessage.equalsIgnoreCase("exit")) {
                        System.out.println("클라이언트가 연결을 종료합니다.");
                        break;
                    }

                    // 서버 → 클라이언트
                    String serverMsg = br.readLine();
                    if (serverMsg == null || serverMsg.equalsIgnoreCase("exit")) {
                        System.out.println("서버가 연결을 종료했습니다.");
                        break;
                    }
                    System.out.println("서버 : " + serverMsg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) pw.close();
                if (br != null) br.close();
                if (socket != null) socket.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

