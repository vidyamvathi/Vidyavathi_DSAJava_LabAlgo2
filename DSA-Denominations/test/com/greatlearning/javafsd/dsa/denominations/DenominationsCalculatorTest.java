package com.greatlearning.javafsd.dsa.denominations;

import java.util.List;

public class DenominationsCalculatorTest {
	public static void main(String[] args) {

		genericScenario(new int[] { 10, 5, 1 }, 12);
	}

	static void genericScenario(int[] denominations, int paymentAmount) {

		DenominationsCalculator calculator = new DenominationsCalculator(denominations, paymentAmount);

		Result result = calculator.calculate();

		boolean exactPaymentAchieved = result.isExactPaymentAchievedOrNot();

		if (exactPaymentAchieved) {

			System.out.println("Exact Payment is Achieved");

			List<DenominationInstancesPair> list = result.getDenominationInstancesList();

			for (DenominationInstancesPair pair : list) {

				int denominationValue = pair.getDenominationValue();
				int noOfInstances = pair.getNoOfInstances();

				System.out.println(
						"Denomination Value is " + denominationValue + ", Number of Instances " + noOfInstances);
			}
		} else {
			System.out.println("Exact payment cannot be achieved...");
		}
	}
}
