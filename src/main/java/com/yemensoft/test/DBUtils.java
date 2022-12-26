package com.yemensoft.test;


/**
 * 
 * singleton class
 *
 */
public class DBUtils {


//  1. define private static instance form the class

	private static DBUtils instance = new DBUtils();
	
//	2. make constructor private
	
	private DBUtils()
	{
		
	}
//	3. provide get method for this instance
	public DBUtils getInstance(){
		return instance;
	}

}
