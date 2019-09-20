package uan.edu.co.CalculoTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ DivisionTest.class, MultiplicacionTest.class, RaizCuadradaTest.class, RestaTest.class, SumaTest.class })
public class AllTests {
	/*public static Test suite() {
		TestSuite suite = new TestSuite("Test para uan.edu.co.CalculoTest");
		suite.addTestSuite(SumaTest.class);
		suite.addTestSuite(RestaTest.class);
		suite.addTestSuite(MultiplicacionTest.class);
		suite.addTestSuite(DivisionTest.class);
		suite.addTestSuite(RaizCuadradaTest.class);
		
		return suite;
	}
	*/
}
