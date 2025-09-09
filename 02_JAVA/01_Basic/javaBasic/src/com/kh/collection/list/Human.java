package com.kh.collection.list;
import java.util.Objects;

public class Human {
    private String name;
    private int age;

    public Human() {
        super();
    }

    public Human(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString() 오버라이드 → 출력 시 보기 좋게
    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + "}";
    }

    // equals() 오버라이드 → name + age 기준으로 동등성 비교
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;         // 자기 자신과 비교
        if (!(obj instanceof Human)) return false; 
        Human h = (Human) obj;
        return age == h.age && name.equals(h.name);
    }

    // hashCode() 오버라이드 → equals와 세트로 반드시 같이 작성
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}