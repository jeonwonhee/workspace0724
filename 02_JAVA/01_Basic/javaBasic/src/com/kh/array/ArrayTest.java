package com.kh.array;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
		//1. 크기가 10인 정수형 배열 생성
		int[] arr1 ;
		arr1 = new int[10];
		
		//2. 반복문을 통해서 0번 인텍스부터 마지막 인덱스까지 10으로 초기화
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=10;
		}
		
		//3. for-each를 통해서 모든 배열의 요소를 출력
		for(int n :arr1 ) {
			System.out.println(n + " ");
		}
		
		//4. 사용자에게 배열의 길이를 입력받아 해당 크기의 문자열 배열 nameArr 을 생성
		Scanner sc = new Scanner (System.in);
		
		System.out.println("배열의 길이를 입력하세요: ");
		int num = sc.nextInt();
		
		String[] nameArr;
		nameArr = new String[num];
		
		//5. 사용자에게 사람의 이름을 입력 받아 nameArr에 할당, nameArr의 모든 요소만큼 실행
		
		for(int i=0; i<nameArr.length; i++) {
			System.out.println("사람의 이름을 입력하세요: ");
			nameArr[i] = sc.next();
		}
		
		/*
		 * for (String name : nameArr){
		 * System.out.println("사람의 이름을 입력하세요: ");
		 * name = sc.next();
		 * */
		
		
		//6. 사용자에게 이름을 하나 입력 받아 nameArr에 동일한 이름이 있다면
		//   동일한 이름이 존재합니다./ 동일한 이름이 존재하지 않습니다. 출력
		System.out.println("이름 " );
		String name = sc.next();
		
		for(int i=0; i<nameArr.length; i++) {
			if(nameArr[i].equals(name)) {
				System.out.println("동일한 이름이 존재합니다.");
				break;
			}else if ( i ==(nameArr.length - 1)) {
				System.out.println("동일한 이름이 존재하지 않습니다.");
			}
		}
		/*
		 * boolean isDul1 = false;
		 * for(String n : nameArr) {
		 *    if(name.equals(n)) {
		 *        isDup1 = true;
		 *        break;
		 *    }
		 * {
		 * 
		 * System.out.println(isDul1 ? "동일한 이름이 존재합니다." : "동일한 이름이 존재하지 않습니다." );
		 * */
	}

}
