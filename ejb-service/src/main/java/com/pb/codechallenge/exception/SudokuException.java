/*******************************************************************
*  SudokuException
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : sudoku exception
*******************************************************************/
package com.pb.codechallenge.exception;

public class SudokuException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3043609129376061556L;
	
	ERROR error;
	
	public	SudokuException(ERROR error){
		super("error occured :"+error.toString());
		this.error= error;
	}

}
