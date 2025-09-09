package com.kh.project1.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileTestRun {
    public static void main(String[] args) {
        // DB 연결 정보
        Properties prop = new Properties();
        // SQL 쿼리 정보
        Properties propXml = new Properties();

        try {
            // .properties 파일 불러오기 (DB 연결 정보)
            prop.load(new FileInputStream("resource/driver.properties"));

            System.out.println("Driver   : " + prop.getProperty("driver"));
            System.out.println("URL      : " + prop.getProperty("url"));
            System.out.println("Username : " + prop.getProperty("username"));
            System.out.println("Password : " + prop.getProperty("password"));

            System.err.println("======================================");

            // .xml 파일 불러오기 (SQL 쿼리)
            propXml.loadFromXML(new FileInputStream("resource/query.xml"));

            System.out.println("selectMovieList : " + propXml.getProperty("selectMovieList"));
            System.out.println("insertReview    : " + propXml.getProperty("insertReview"));
            System.out.println("updateReview    : " + propXml.getProperty("updateReview"));
            System.out.println("selectReviewList: " + propXml.getProperty("selectReviewList"));
            System.out.println("deleteReview    : " + propXml.getProperty("deleteReview"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
