package com.threekingdoms;

import java.util.List;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ThreeKingdomsApp {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 삼국지 텍스트 게임 ===");
        System.out.println();

        List<General> generals = GeneralData.getHistoricalGenerals();
        System.out.println("=== 장수 목록 ===");

        printGeneralsByKingdom(generals, "위");
        printGeneralsByKingdom(generals, "촉");
        printGeneralsByKingdom(generals, "오");

        List<City> cities = CityData.getCities();
        System.out.println();
        System.out.println("=== 도시 목록 ===");
        for (City city : cities) {
            System.out.println(city);
        }

        System.out.println();
        System.out.println("삼국지 게임이 시작됩니다!");

        scanner.close();
    }

    private static void printGeneralsByKingdom(List<General> generals, String kingdom) {
        System.out.println();
        System.out.println("=== " + kingdom + " 나라 장수들 ===");
        for (General general : generals) {
            if (general.getKingdom().equals(kingdom)) {
                System.out.println(general);
            }
        }
    }
}