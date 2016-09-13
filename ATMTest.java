package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
ATM atm1;
ATM atmWithCash;
	@Before
	public void setUp() throws Exception {
		atm1 = new ATM();
		atmWithCash = new ATM(100);
	}

	@Test
	public void testDeposit() {
		atmWithCash.deposit(20);
		double actual = atmWithCash.getBalance();
		double expected = 120;
		assertEquals(actual,expected,0);
	}

	@Test
	public void testGetBalance() {
		double expected = 100;
		double actual = atmWithCash.getBalance();
		assertEquals(expected,actual,0);
	}

	@Test
	public void testToString() {
		String actual = atmWithCash.toString();
		String expected = "Amount balance is $100.00";
		assertEquals(actual,expected);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testWithdraw() {
		 atm1.withdraw(100);
		 atmWithCash.withdraw(20);
		 double actual = atmWithCash.getBalance();
		 double expected = 80;
		 assertEquals(actual,expected,0);
	}
}
