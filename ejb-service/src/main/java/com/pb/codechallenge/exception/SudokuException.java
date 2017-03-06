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
