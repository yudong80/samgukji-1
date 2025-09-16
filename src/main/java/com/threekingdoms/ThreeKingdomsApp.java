package com.threekingdoms;

import java.util.List;
import java.util.Scanner;

public class ThreeKingdomsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 삼국지 텍스트 게임 ===");
        System.out.println();

        // 장수 데이터 로드 및 출력
        List<General> generals = GeneralData.getHistoricalGenerals();
        System.out.println("=== 장수 목록 ===");

        // 국가별로 분류해서 출력
        printGeneralsByKingdom(generals, "위");
        printGeneralsByKingdom(generals, "촉");
        printGeneralsByKingdom(generals, "오");

        // 도시 데이터 로드 및 출력
        List<City> cities = CityData.getCities();
        System.out.println();
        System.out.println("=== 도시 목록 ===");
        for (City city : cities) {
            System.out.println(city);
        }

        System.out.println();
        System.out.println("게임을 시작하려면 아무 키나 누르세요...");
        scanner.nextLine();

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