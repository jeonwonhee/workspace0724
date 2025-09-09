package com.kh.array;
import java.util.Scanner;
public class Array2DTeset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자에게 행과 열을 입력받아
		//해당 행과 열의 빙고판을 만들어라
		//다음 행과 열의 들어갈 문자를 각각 모두 입력받아 저장한 뒤 출력해라
		
		/*
		 * 행: 2
		 * 열: 3
		 * 
		 * 1행1열 : 바나나
		 * 1행2열: 배
		 * ...
		 * 2행 3열: 귤
		 * */
		        
/*
		        System.out.print("행 개수 입력: ");
		        int rows = sc.nextInt();
		        System.out.print("열 개수 입력: ");
		        int cols = sc.nextInt();

		        String[][] arr = new String[rows][cols];

		        for (int i = 0; i < arr.length; i++) {
		            for (int k = 0; k < arr[i].length; k++) {
		                System.out.print((i + 1) + "행 " + (k + 1) + "열: ");
		                arr[i][k] = sc.next();
		            }
		        }

		        
		        for (int i = 0; i < arr.length; i++) {
		            for (int k = 0; k < arr[i].length; k++) {
		                System.out.print(arr[i][k] + " ");
		            }
		            System.out.println();
		        }

		        */
		
		//사용자에게 좌석의 행과 열을 입력 받아 2차원 배열을 생성해라
		//각 좌석에 들어갈 관객의 이름을 입력받아 저장한 뒤
		//모두 입력받았으면 좌석표를 출력
		//행(줄)의 수:
		//열(좌석)의 수:
		
		//1행 1열:철수
		//...
		//=========좌석표===========\
		//철수 민수 상수 ...
		
		System.out.println("행(줄)의 수: ");
		int row = sc.nextInt();
		
		System.out.println("열(좌석)의 수: ");
		int col = sc.nextInt();
		
		String[][] seat = new String[row][col];
		
		for(int i=0; i <seat.length; i++) {
			for(int k=0; k<seat[i].length; k++) {
				System.out.println( (i+1) + "행" + (k+1) + "열: ");
				seat[i][k]=sc.next();
			}
		}
				
		System.out.println("========좌석표========");
		
		for(int i=0; i <seat.length; i++) {
			for(int k=0; k<seat[i].length; k++) {
				System.out.print( seat[i][k] + " ");
			}
			System.out.println();
		}
   }
		

		
		
}


