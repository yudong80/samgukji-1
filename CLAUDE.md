# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a text-based Three Kingdoms (삼국지) strategy game written in Java. The game features historical generals from the Wei (위), Shu (촉), and Wu (오) kingdoms, each with stats for force (무력), intelligence (지력), leadership (통솔력), and charm (매력). Cities have properties including population (인구), morale (민심), economy (경제력), gold (금), and rice (쌀).

## Build and Run Commands

To compile and run the application:

```bash
cd src/main/java
javac com/threekingdoms/*.java
java com.threekingdoms.ThreeKingdomsApp
```

## Architecture

- **General.java**: Core class representing historical generals with four stats (1-100 range)
- **City.java**: Represents cities with economic and population data
- **GeneralData.java**: Static data containing 30 historical generals (10 per kingdom)
- **CityData.java**: Static data for cities including Xuchang (허창), Luoyang (낙양) and surrounding areas
- **ThreeKingdomsApp.java**: Main application entry point
- **1.json**: JSON export of all general data

## Data Structure

- Generals have 4 core stats: force, intelligence, leadership, charm (all 1-100)
- Cities track: population, morale (1-100), economy (1-100), gold, rice
- Three kingdoms: Wei (위), Shu (촉), Wu (오) with 10 historical generals each