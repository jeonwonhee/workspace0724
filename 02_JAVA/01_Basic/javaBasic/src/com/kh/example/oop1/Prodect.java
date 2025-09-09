package com.kh.example.oop1;

public class Prodect {
    // 필드
    private String pName;
    private int price;
    private String brand;

    // 기본 생성자
    public Prodect() {
        this.pName = "상품 없음";
        this.price = 0;
        this.brand = "브랜드 없음";
    }

    // 메서드
    public void information() {
        System.out.printf("상품명 : %s / 가격 : %d / 브랜드 : %s \n", pName, price, brand);
    }

    // Getter / Setter
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
