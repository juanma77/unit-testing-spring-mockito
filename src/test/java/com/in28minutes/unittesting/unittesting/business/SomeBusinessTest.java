package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

/* Con esta clase probamos los escenarios básicos para el cálculo de la suma de los elementos de un 
   vector, sin utilizar servicio alguno
*/
 
public class SomeBusinessTest {
	
	// Con "Test" se indica que se hace un método de prueba 
	@Test
	public void calculateSum_basicScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		
		int actualResult = someBusinessImpl.calculateSum( new int [] { 1, 2, 3 } ); 
		int expectedResult = 6; 
		
		// En el assertEquals se manda el resultado esperado y el resultado actual 
		assertEquals( expectedResult, actualResult );		
		
	}
	
	@Test
	public void calculateSum_emptyScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		
		int actualResult = someBusinessImpl.calculateSum( new int [] { } ); 
		int expectedResult = 0; 
		
		// Se manda el resultado esperado y el resultado actual 
		assertEquals( expectedResult, actualResult );		
		
	}
	
	@Test
	public void calculateSum_oneValueScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		
		int actualResult = someBusinessImpl.calculateSum( new int [] { 5 } ); 
		int expectedResult = 5; 
		
		// Se manda el resultado esperado y el resultado actual 
		assertEquals( expectedResult, actualResult );		
		
	}

}
