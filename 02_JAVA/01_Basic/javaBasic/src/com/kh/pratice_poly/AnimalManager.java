	package com.kh.pratice_poly;
	import java.util.Scanner;
	public class AnimalManager {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 Animal[] animals = new Animal[5];
			 
			 
			 /*
			 animals[0]= new Dog("먼지",3,"포메라니안");
			 animals[1]= new Dog("까꿍", 3, "진돗개");
			 animals[2]= new Cat("자두", 3, "흰색");
			 animals[3]= new Cat("까미", 3, "검은색");
			 animals[4]= new Dog("바둑이", 3, "진돗개");
			*/
			 
			 for(int i=0; i<animals.length; i++) {
				 System.out.print("1. 강아지 2. 고양이 : ");
				 int num = sc.nextInt();
				 
				 System.out.println("이름: ");
				 String name = sc.next();
				 
				 System.out.println("나이: ");
				 int age = sc.nextInt();
				 
				 if(num==1) {
					 System.out.println("견종 : ");
					 String breed = sc.next();
					 animals[i]=new Dog(name, age, breed);
				 }else {
					 System.out.println("색상 : ");
					 String color=sc.next();
					 animals[i]=new Cat(name, age, color);
				 }
				 
				 
			 }
			 
			 //향상된 for문을 활용하여 모든 동물의 speak() 호출
			 for(Animal a : animals) {
				 a.speak(); //다형성으로 공통기능 호출 가능..
				 if (a instanceof Dog) {
					 //Animal이 부모이므로 breed와 color를 나타내려면 다운캐스팅이 필요함
				       // Dog d = (Dog) a;  // 다운캐스팅 필요
					 String breed = ((Dog)a).getBreed();
				        System.out.println("이 개의 견종은 " + breed);
				    } else if (a instanceof Cat) {
				      //  Cat c = (Cat) a;  // 다운캐스팅 필요
				    	String color = ((Cat)a).getColor();
				        System.out.println("이 고양이의 색상은 " + color);
				    }
			 }
			 
			 
	
		}
	
	}
