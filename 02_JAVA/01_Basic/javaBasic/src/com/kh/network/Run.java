package com.kh.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
	/*
	 * 네트워크 : 여러 대의 컴퓨터들이 연결되어 있는 통신망
	 * 
	 * IP주소 : 네트워크상에 각 컴퓨터를 식별할 수 있는 주소
	 * port : 컴퓨터에서 응용프로그램을 식별하기 위한 코드
	 * 
	 * 서버 - 클라이언트 연결방식
	 * 클라이언트 : 서버에 요청을 보내는 컴퓨터(서비스를 제공받는 고객)
	 * 서버 : 클라이언트의 요청을 받아서 고객에게 서비스를 제공해주는 프로그램 또는 컴퓨터
	 * 
	 * 도메인 : 특정 서버에 접근하기 위한 정보(ip, port)를 사람이 읽고 기억하기 어려움 -> 쉽게 만든 주소
	 *       -> 실제 도메인으로 요청 시 DNS에서 IP로 변경해서 위치를 찾음.
	 *       
	 *       서버에 요청을 보내기 위해서는 요청하고자 하는 서버의 IP주소, port번호를 알아야 함
	 * */
	
	// InetAddress: 네트워크 정보를 확인할 수 있는 객체

	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 정보: " + localhost);

			System.out.println("내 pc명 : " + localhost.getHostName());
			System.out.println("내 ip주소 : " + localhost.getHostAddress());
			// 추가 예시: 도메인으로 IP 조회
			InetAddress naver = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 IP: " + naver.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
