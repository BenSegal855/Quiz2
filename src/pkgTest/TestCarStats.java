package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.CarStats;

class TestCarStats
{

	@Test
	void test()
	{
		CarStats car1 = new CarStats(35000,0,.1,60);
		CarStats car2 = new CarStats(50000,12000,.15,60);
		
		assertEquals(car1.monthlyPayment(), -743.6465648943916);
		assertEquals(car1.totalIntrestPay(), -9618.793893663496);
		assertEquals(car2.monthlyPayment(), -904.0173432816339);
		assertEquals(car2.totalIntrestPay(), -16241.040596898034);
	}

}
