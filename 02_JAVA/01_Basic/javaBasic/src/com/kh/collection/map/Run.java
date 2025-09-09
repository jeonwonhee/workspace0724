package com.kh.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Run {
	/*
	 * Map
	 * key와 value를 쌍으로 저장하는 자료구조
	 * key는 중복불가, value는 중복가능
	 * HashMap(가장 보편적이고 속도 향상)
	 * LinkedHashMap(입력순서보장)
	 * TreeMap(정렬된 key순서유지)
	 */
	public static void main(String[] args) {
	    Map<Integer, Human> hMap = new HashMap<>();
	    
	    //1. put() : map에 key, value쌍으로 값 추가
	    hMap.put(10, new Human("전원희", 20));
	    hMap.put(20, new Human("전이희", 30));
	    hMap.put(30, new Human("전일희", 40));
	    hMap.put(40, new Human("전윤희", 50));
	    hMap.put(50, new Human("전윤희", 50));
	    hMap.put(40, new Human("전윤지", 50)); // 동일 key → 값 덮어씀
	    
	    System.out.println(hMap); // 저장되는 순서 유지 안됨
	    
	    //2. get(key) : 해당 key의 value 반환
	    System.out.println(hMap.get(30));
	    
	    //3. size() : 담겨있는 객체 수
	    System.out.println("size : " + hMap.size());
	    
	    //4. remove(key) : 해당 key/value 제거
	    hMap.remove(40);
	    System.out.println(hMap);
	    
	    // Map 전체 요소 탐색 방법
	    // 1. keySet() 이용
	    Set<Integer> keySet = hMap.keySet();
	    System.out.println(keySet);
	    
	    for (Integer key : keySet) {
	        System.out.println("키 : " + key + " 값 : " + hMap.get(key));
	    }
	    
	    // 2. entrySet() 이용 (key+value 한 번에 꺼내기)
	    Set<Map.Entry<Integer, Human>> entrySet = hMap.entrySet();
	    for (Map.Entry<Integer, Human> entry : entrySet) {
	        System.out.println(entry.getKey() + " = " + entry.getValue());
	    }
	}
}
