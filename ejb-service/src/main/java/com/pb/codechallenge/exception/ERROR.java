/*******************************************************************
*  ERROR
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : Contains all the errors
*******************************************************************/
package com.pb.codechallenge.exception;

public enum ERROR {
INVALID_FILL("PE0001","The cell already filled"), INVALID_COUNT("PE0002","Invalid count encounterd"), 
UNSUPORTED_PUZZELTYPE("PE0003","Only 9*9 puzzel is supported"), 
INVALID_INPUT("PE0004","Invalid input for this puzzel");
	
	ERROR(final String code,final String msg ){
		this.code=code;
		this.msg =msg;
		
	}
	private String code;
	private  String msg;
	
	public String toString(){
		return "code :"+code +" | message: "+msg;
	}
}
