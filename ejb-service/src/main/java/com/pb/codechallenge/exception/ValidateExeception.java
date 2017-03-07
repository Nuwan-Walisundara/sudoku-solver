/*******************************************************************
*  ValidateExeception
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : sudoku exception
*******************************************************************/
package com.pb.codechallenge.exception;

public class ValidateExeception extends SudokuException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1939218072904200679L;

	public ValidateExeception(ERROR error) {
		super(error);
	}

}
