package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataServiceInterface;

public class SomeBusinessImpl {
	
	private SomeDataServiceInterface someDataService; 
	
	public void setSomeDataService( SomeDataServiceInterface someDataService ) {
		
		this.someDataService = someDataService; 
		
	}
	
	public int calculateSum( int [] data ) {
		
		int sum = 0; 
		
		for( int value : data ) {
			
			sum = sum + value; 
			
		}
		
		return sum; 
		
	}
	
	public int calculateSumUsingDataService() {
		
		int sum = 0; 
		int data [] = someDataService.retrieveAllData(); 
		
		for( int value : data ) {
			
			sum = sum + value; 
			
		}
		
		return sum; 
		
	}

}
