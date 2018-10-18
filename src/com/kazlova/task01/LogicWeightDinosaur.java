package com.kazlova.task01;

public class LogicWeightDinosaur {
	
	static final double KG_TO_G = 1000;
	static final double KG_TO_Mg = 1000000;
	static final double KG_TO_T = 0.001;
	
    public static double calcWeightG(double weightKg) {
    	return weightKg*KG_TO_G;
    }
    public static double calcWeightMg(double weightKg) {
    	return weightKg*KG_TO_Mg;
    }
    public static double calcWeightT(double weightKg) {
    	return weightKg*KG_TO_T;
    }
}
