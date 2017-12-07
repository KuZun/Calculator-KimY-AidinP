package com.example.maven.Finalproject_KimYiayong_AidinParsiani;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class ScientificCalculatorTest {
	ScientificCalculator scf = new ScientificCalculator();
	static final Logger LOG = Logger.getLogger(SimpleCalculator.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testSqrtPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 100;
			result = Math.sqrt(firstNumber);

			LOG.info("Testing the method pos sqrt with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.sqrt(firstNumber), result, 0);
		}

	}

	@Test
	public void testSqrtNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * -100;
			result = Math.sqrt(firstNumber);

			LOG.info("Testing the method nega sqrt with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.sqrt(firstNumber), result, 0);
		}
	}

	@Test
	public void testSqrtZeroNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = Math.sqrt(firstNumber);

			LOG.info("Testing the method zero sqrt with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.sqrt(firstNumber), result, 0);
		}
	}

	@Test
	public void testPow2PositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 10;
			result = scf.pow2(firstNumber);

			LOG.info("Testing the method pos pow2 with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.pow2(firstNumber), result, 0);
		}
	}

	@Test
	public void testPow2NegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * -10;
			result = scf.pow2(firstNumber);

			LOG.info("Testing the method negative pow2 with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.pow2(firstNumber), result, 0);
		}
	}

	@Test
	public void testPow2ZeroNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.pow2(firstNumber);

			LOG.info("Testing the method zero pow2 with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.pow2(firstNumber), result, 0);
		}
	}

	@Test
	public void testPow3PositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 10;
			result = scf.pow3(firstNumber);

			LOG.info("Testing the method pos pow3 with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.pow3(firstNumber), result, 0);
		}
	}

	@Test
	public void testPow3NegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * -10;
			result = scf.pow3(firstNumber);

			LOG.info("Testing the method negative pow3 with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.pow3(firstNumber), result, 0);
		}
	}

	@Test
	public void testPow3ZeroNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.pow3(firstNumber);

			LOG.info("Testing the method zero pow3 with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.pow3(firstNumber), result, 0);
		}
	}

	@Test
	public void testSinPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		firstNumber = random.nextDouble() * 10;
		for (int i = 0; i < 50; i++) {
			result = scf.SIN(firstNumber);

			LOG.info("Testing the method pos SIN with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.SIN(firstNumber), result, 0);
		}
	}

	@Test
	public void testSinNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		firstNumber = random.nextDouble() * -10;
		for (int i = 0; i < 50; i++) {
			result = scf.SIN(firstNumber);

			LOG.info("Testing the method Negat SIN with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.SIN(firstNumber), result, 0);
		}
	}
	@Test
	public void testSinZeroNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.SIN(firstNumber);

			LOG.info("Testing the method Zero SIN with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.SIN(firstNumber), result, 0);
}
	}
	@Test
	public void testCosPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;
		
		firstNumber = random.nextDouble() * 10;
		for (int i = 0; i < 50; i++) {
			result = scf.COS(firstNumber);

			LOG.info("Testing the method Pos COS with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.COS(firstNumber), result, 0);
}
	}
	@Test
	public void testCosNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.COS(firstNumber);
			firstNumber = random.nextDouble() * -10;
			LOG.info("Testing the method negative COS with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.COS(firstNumber), result, 0);
}
	}
	@Test
	public void testCosZeroNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.COS(firstNumber);
			LOG.info("Testing the method zero COS with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.COS(firstNumber), result, 0);
}
	}
	@Test
	public void testTanPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;
		
		firstNumber = random.nextDouble() * 10;
		for (int i = 0; i < 50; i++) {
			result = scf.TAN(firstNumber);

			LOG.info("Testing the method Pos Tan with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.TAN(firstNumber), result, 0);
}
	}
	@Test
	public void testTanNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.COS(firstNumber);
			firstNumber = random.nextDouble() * -10;
			LOG.info("Testing the method negative TAN with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.COS(firstNumber), result, 0);
}
	}
	@Test
	public void testTanZeroNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			result = scf.TAN(firstNumber);
			LOG.info("Testing the method negative Tan with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(scf.TAN(firstNumber), result, 0);
}
	}
}