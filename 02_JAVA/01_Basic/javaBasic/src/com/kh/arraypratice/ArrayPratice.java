package com.kh.arraypratice;
import java.util.Scanner;
public class ArrayPratice {
	/*
	 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다
	 * 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 
	 * 색종이의 변과 도화지의 변이 평행하도록 붙인다.
	 * 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후
	 *  색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오
	 * */

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * f f f f f f ...
	 * f f f f f f
	 * f f f f f f
	 * f f f f f f  
	 * ...
	 * 
	 * */
    boolean[][] paper = new boolean[100][100];
    
    int n = sc.nextInt(); //색종이를 붙일 횟수
    
    for(int k=0; k<n; k++) {
    	int x = sc.nextInt(); //왼쪽으로부터 색종이와의 거리
    	int y = sc.nextInt(); //아래로부터 색종이와의 거리
    	
    	for(int i=x; i<x+10; i++ ) {
    		for(int j=y; j<y+10; j++) {
    			paper[i][j] = true;
    		}
    	}
    }
    
    int area = 0;
    for(int i=0; i<paper.length; i++) {
    	for(int j=0; j<paper[i].length; j++) {
    		if(paper[i][j]) {
    			area++;
    		}
    	}
    }
    System.out.println(area);

	}

}
