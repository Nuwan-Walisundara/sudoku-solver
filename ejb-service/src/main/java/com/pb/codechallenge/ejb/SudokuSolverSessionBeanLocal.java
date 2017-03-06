package com.pb.codechallenge.ejb;

import javax.ejb.Local;

import com.pb.codechallenge.model.SolutionDTO;

@Local
public interface SudokuSolverSessionBeanLocal {
	Returnable compile(final String inputString)throws Exception;
}
