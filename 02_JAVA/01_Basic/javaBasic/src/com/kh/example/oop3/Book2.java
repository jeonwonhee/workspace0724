package com.kh.example.oop3;

public class Book2 {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // 기본 생성자
    public Book2() {
        this.title = "제목 없음";
        this.publisher = "출판사 없음";
        this.author = "저자 없음";
        this.price = 0;
        this.discountRate = 0.0;
    }

    // 3개 필드를 받는 생성자
    public Book2(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = 0;
        this.discountRate = 0.0;
    }

    // 5개 필드를 받는 생성자
    public Book2(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    // Getter / Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // 정보 출력 메서드
    public void inform() {
        System.out.println("제목 : " + title);
        System.out.println("출판사 : " + publisher);
        System.out.println("저자 : " + author);
        System.out.println("가격 : " + price);
        System.out.println("할인율 : " + discountRate);
    }
}
