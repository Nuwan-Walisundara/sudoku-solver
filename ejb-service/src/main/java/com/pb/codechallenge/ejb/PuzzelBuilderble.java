/*******************************************************************
*  ErrorReturnDTO
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : Interface for implementing varius types of sudoku puzzels
*******************************************************************/
package com.pb.codechallenge.ejb;

import com.pb.codechallenge.exception.SudokuException;
import com.pb.codechallenge.model.SolutionDTO;

public interface PuzzelBuilderble {
	/**
	 * This insert the given array into the puzzel
	 * @param inputArray
	 * @throws SudokuException
	 */
	void fill(final String[] inputArray)throws SudokuException ;
	/**
	 * this return the completed solution
	 * @return
	 * @throws SudokuException
	 */
	SolutionDTO getResult()throws SudokuException ;
}
