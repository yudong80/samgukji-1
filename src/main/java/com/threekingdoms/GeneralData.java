package com.threekingdoms;

import java.util.ArrayList;
import java.util.List;

public class GeneralData {
    public static List<General> getHistoricalGenerals() {
        List<General> generals = new ArrayList<>();

        // 위(Wei) 장수들 10명
        generals.add(new General("조조", "위", 72, 96, 96, 96));
        generals.add(new General("사마의", "위", 60, 96, 96, 81));
        generals.add(new General("허저", "위", 96, 37, 71, 62));
        generals.add(new General("전위", "위", 90, 35, 67, 58));
        generals.add(new General("곽가", "위", 25, 98, 75, 88));
        generals.add(new General("순욱", "위", 20, 96, 85, 93));
        generals.add(new General("장료", "위", 87, 75, 85, 76));
        generals.add(new General("악진", "위", 89, 67, 80, 70));
        generals.add(new General("우금", "위", 83, 70, 88, 72));
        generals.add(new General("장합", "위", 84, 78, 86, 74));

        // 촉(Shu) 장수들 10명
        generals.add(new General("유비", "촉", 73, 75, 85, 99));
        generals.add(new General("관우", "촉", 97, 74, 85, 87));
        generals.add(new General("장비", "촉", 96, 30, 65, 42));
        generals.add(new General("제갈량", "촉", 38, 100, 96, 93));
        generals.add(new General("조운", "촉", 93, 76, 85, 80));
        generals.add(new General("마초", "촉", 95, 58, 75, 89));
        generals.add(new General("황충", "촉", 91, 58, 71, 65));
        generals.add(new General("방통", "촉", 35, 98, 80, 85));
        generals.add(new General("법정", "촉", 20, 92, 70, 78));
        generals.add(new General("위연", "촉", 90, 65, 78, 55));

        // 오(Wu) 장수들 10명
        generals.add(new General("손권", "오", 70, 83, 91, 89));
        generals.add(new General("주유", "오", 71, 96, 91, 98));
        generals.add(new General("감녕", "오", 92, 65, 78, 73));
        generals.add(new General("태사자", "오", 96, 45, 67, 71));
        generals.add(new General("황개", "오", 88, 70, 85, 75));
        generals.add(new General("육손", "오", 63, 95, 89, 85));
        generals.add(new General("주태", "오", 86, 55, 82, 68));
        generals.add(new General("정보", "오", 75, 88, 87, 82));
        generals.add(new General("능통", "오", 84, 72, 80, 70));
        generals.add(new General("한당", "오", 85, 68, 83, 72));

        return generals;
    }
}