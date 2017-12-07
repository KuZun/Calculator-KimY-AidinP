package com.example.maven.Finalproject_KimYiayong_AidinParsiani;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class SimplecalculatorTest {
	SimpleCalculator sc = new SimpleCalculator();
	static final Logger LOG = Logger.getLogger(SimpleCalculator.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAdditionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = random.nextDouble() * 10;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber) + " Result: " + result);
			assertEquals(sc.addition(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testAdditionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * -10;
			secondNumber = random.nextDouble() * -10;
			result = firstNumber + secondNumber;

			LOG.info("Testing method addition with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.addition(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testAdditionZeroNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = 0;

			result = firstNumber + secondNumber;
			sc.addition(firstNumber, secondNumber);

			LOG.info("Testing method addition with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.addition(firstNumber, secondNumber), result, 0);

		}

	}
	@Test
	public void testSubstractionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = random.nextDouble() * 10;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method negative substraction with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber) + " Result: " + result);
			assertEquals(sc.substraction(firstNumber, secondNumber), result, 0);
		}
	}
	@Test
	public void testSubstractionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * -10;
			secondNumber = random.nextDouble() * -10;
			result = firstNumber - secondNumber;
			LOG.info("Testing method Negative substraction with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.substraction(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testSubstractionZeroNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = 0;
			result = firstNumber - secondNumber;

			LOG.info("Testing method Zero substraction with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.substraction(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testMultiplicationPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = random.nextDouble() * 10;
			result = firstNumber * secondNumber;

			LOG.info("Testing method Positive multiplication with number: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.multiplication(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testMultiplicationNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * -10;
			secondNumber = random.nextDouble() * -10;
			result = firstNumber * secondNumber;
			sc.multiplication(firstNumber, secondNumber);

			LOG.info("Testing method Negative multiplication with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.multiplication(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testMultiplicationZeroNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = 0;
			result = firstNumber * secondNumber;
			sc.multiplication(firstNumber, secondNumber);

			LOG.info("Testing method Zero multiplication with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.multiplication(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testDivisionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = random.nextDouble() * 10;
			result = firstNumber / secondNumber;
			sc.division(firstNumber, secondNumber);

			LOG.info("Testing method Positive division with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.division(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testDivisionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = random.nextDouble() * 10;
			secondNumber = 0 - secondNumber;
			result = firstNumber / secondNumber;
			sc.division(firstNumber, secondNumber);

			LOG.info("Testing method Negative division with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.division(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testDivisionZeroNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 50; i++) {
			firstNumber = random.nextDouble() * 10;
			secondNumber = 0;
			result = firstNumber / secondNumber;
			sc.division(firstNumber, secondNumber);

			LOG.info("Testing method Zero division with numbers: " + df.format(firstNumber) + " and "
					+ df.format(secondNumber));
			assertEquals(sc.division(firstNumber, secondNumber), result, 0);
		}
	}

}