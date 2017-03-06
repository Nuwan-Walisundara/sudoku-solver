package com.pb.codechallenge.ejb;

import com.pb.codechallenge.exception.SudokuException;
import com.pb.codechallenge.model.SolutionDTO;

public interface PuzzelBuilderble {
	void fill(final String[] inputArray)throws SudokuException ;
	SolutionDTO getResult()throws SudokuException ;
}
