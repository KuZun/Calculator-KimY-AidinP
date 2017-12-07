package com.example.maven.Finalproject_KimYiayong_AidinParsiani;
import Interfaces.CalculatorAdvancedOperationsInterface;

public class ScientificCalculator implements CalculatorAdvancedOperationsInterface   {

	public double sqrt(double firstNumber) {
		return Math.sqrt(firstNumber);
	}

	public double pow2(double firstNumber) {
		return Math.pow(firstNumber, 2);
	}

	public double pow3(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.pow(firstNumber, 3);
	}

	public double TAN(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.tan(firstNumber);
	}

	public double COS(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.cos(firstNumber);
	}

	public double SIN(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.sin(firstNumber);
	}
	
}
