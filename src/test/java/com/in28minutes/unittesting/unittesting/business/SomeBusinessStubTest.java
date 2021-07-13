package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.unittesting.unittesting.data.SomeDataServiceInterface;

// En las siguientes tres clases utilizamos un servicio stub para obtener los datos 
class SomeDataServiceStubBasicScenario implements SomeDataServiceInterface {

	@Override
	public int[] retrieveAllData() {
		
		return new int [] { 1, 2, 3 };
	}
	

}

class SomeDataServiceStubEmptyScenario implements SomeDataServiceInterface {

	@Override
	public int[] retrieveAllData() {
		
		return new int [] { };
	}
	

}

class SomeDataServiceStubOneValueScenario implements SomeDataServiceInterface {

	@Override
	public int[] retrieveAllData() {
		
		return new int [] { 5 };
	}
	

}


// En esta clase de prueba, precisamente probamos el stub que creamos en la parte de arriba 
public class SomeBusinessStubTest {
	
	// Con "Test" se indica que se hace un método de prueba 
	@Test
	public void calculateSumUsingDataService_basicScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		someBusinessImpl.setSomeDataService( new SomeDataServiceStubBasicScenario() );
		
		int actualResult = someBusinessImpl.calculateSumUsingDataService();
		int expectedResult = 6; 
		
		// En el assertEquals se manda el resultado esperado y el resultado actual 
		assertEquals( expectedResult, actualResult );		
		
	}
	
	@Test
	public void calculateSum_emptyScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		someBusinessImpl.setSomeDataService( new SomeDataServiceStubEmptyScenario() );
		
		int actualResult = someBusinessImpl.calculateSumUsingDataService();
		int expectedResult = 0; 
		
		// Se manda el resultado esperado y el resultado actual 
		assertEquals( expectedResult, actualResult );		
		
	}
	
	@Test
	public void calculateSum_oneValueScenario() {
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		someBusinessImpl.setSomeDataService( new SomeDataServiceStubOneValueScenario() );
		
		int actualResult = someBusinessImpl.calculateSumUsingDataService();
		int expectedResult = 5;
		
		// Se manda el resultado esperado y el resultado actual 
		assertEquals( expectedResult, actualResult );		
		
	}
	

}
