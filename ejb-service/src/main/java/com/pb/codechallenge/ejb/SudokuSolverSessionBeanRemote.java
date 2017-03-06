package com.pb.codechallenge.ejb;

import javax.ejb.Remote;

import com.pb.codechallenge.model.SolutionDTO;

@Remote
public interface SudokuSolverSessionBeanRemote {
	Returnable compile(final String inputString)throws Exception;
}
