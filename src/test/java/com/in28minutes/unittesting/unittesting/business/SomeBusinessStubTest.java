package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.unittesting.unittesting.data.SomeDataServiceInterface;

// En esta clase utilizamos un servicio stub para obtener los datos 
class SomeDataServiceStub implements SomeDataServiceInterface {

	@Override
	public int[] retrieveAllData() {
		
		return new int [] { 1, 2, 3 };
	}
	

}


// En esta clase de prueba, precisamente probamos el stub que creamos en la parte de arriba 
public class SomeBusinessStubTest {
	
	// Con "Test" se indica que se hace un método de prueba 
	@Test
	public void calculateSumUsingDataService_basicScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		
		someBusinessImpl.setSomeDataService( new SomeDataServiceStub() );
		
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
