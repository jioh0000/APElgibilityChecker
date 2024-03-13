package dev.suhjae.elgibility.model;

import java.util.ArrayList;

public class TestData {
    private int maxSatTotal;
    private int maxSatEBRW;
    private int maxSatMath;
    private int recentSatTotal;
    private int recentSatEBRW;
    private int recentSatMath;
    private int recentPsatTotal;
    private int recentPsatMath;
    private int recentPsatEBRW;
    private int maxPsatTotal;
    private int maxPsatEBRW;
    private int maxPsatMath;

    public TestData(int maxSatTotal, int maxSatEBRW, int maxSatMath,
                    int recentSatTotal, int recentSatEBRW, int recentSatMath,
                    int maxPsatTotal, int maxPsatEBRW, int maxPsatMath,
                    int recentPsatTotal, int recentPsatMath, int recentPsatEBRW) {
        this.maxSatTotal = maxSatTotal;
        this.maxSatEBRW = maxSatEBRW;
        this.maxSatMath = maxSatMath;
        this.recentSatTotal = recentSatTotal;
        this.recentSatEBRW = recentSatEBRW;
        this.recentSatMath = recentSatMath;
        this.maxPsatTotal = maxPsatTotal;
        this.maxPsatEBRW = maxPsatEBRW;
        this.maxPsatMath = maxPsatMath;
        this.recentPsatTotal = recentPsatTotal;
        this.recentPsatMath = recentPsatMath;
        this.recentPsatEBRW = recentPsatEBRW;
    }
    //SAT
    public int getMaxSatTotal() {
        return maxSatTotal;
    }
    public int getMaxSatMath() {
        return maxSatMath;
    }
    public int getMaxSatEBRW() {
        return maxSatEBRW;
    }
    //recent SAT
    public int getRecentSatTotal() {
        return recentSatTotal;
    }
    public int getRecentSatMath() {
        return recentSatMath;
    }
    public int getRecentSatEBRW() {
        return recentSatEBRW;
    }
    //PSAT
    public int getMaxPsatTotal(){
        return maxPsatTotal;
    }
    public int getMaxPsatEBRW(){
        return maxPsatEBRW;
    }
    public int getMaxPsatMath(){
        return maxPsatMath;
    }
    //recent PSAT
    public int getRecentPsatTotal(){
        return recentPsatTotal;
    }
    public int getRecentPsatMath(){
        return recentPsatMath;
    }
    public int getRecentPsatEBRW(){
        return recentPsatEBRW;
    }

}
