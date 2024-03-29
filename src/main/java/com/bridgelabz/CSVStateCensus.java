package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CSVStateCensus implements Comparable<CSVStateCensus> {


    @CsvBindByName(column = "StateName")
    private String state;
    @CsvBindByName(column = "Population")
    private String population;
    @CsvBindByName(column = "AreaInSqKm")
    private String areaInSqMs;
    @CsvBindByName(column = "DensityPerSqKm")
    private String densityPerSqKm;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getAreaInSqMs() {
        return areaInSqMs;
    }

    public void setAreaInSqMs(String areaInSqMs) {
        this.areaInSqMs = areaInSqMs;
    }

    public String getDensityPerSqKm() {
        return densityPerSqKm;
    }

    public void setDensityPerSqKm(String densityPerSqKm) {
        this.densityPerSqKm = densityPerSqKm;
    }

    @Override
    public String toString() {
        return "CSVStateCensus{" +
                ", state='" + state + '\'' +
                ", population='" + population + '\'' +
                ", areaInSqMs='" + areaInSqMs + '\'' +
                ", densityPerSqKm='" + densityPerSqKm + '\'' +
                '}';
    }

    @Override
    public int compareTo(CSVStateCensus csvStateCensus) {
        return this.getPopulation().compareTo(csvStateCensus.state);
    }
}
