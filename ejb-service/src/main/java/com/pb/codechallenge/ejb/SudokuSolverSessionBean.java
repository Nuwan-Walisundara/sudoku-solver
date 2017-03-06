package com.pb.codechallenge.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.pb.codechallenge.model.ErrorReturnDTO;
import com.pb.codechallenge.util.PuzzelType;

@Stateless(name = "SudokuSolverSessionBean", mappedName = "ejb/SudokuSolverSessionBean")
@Local( SudokuSolverSessionBeanLocal.class  )
@Remote( SudokuSolverSessionBeanRemote.class )
public class SudokuSolverSessionBean implements SudokuSolverSessionBeanLocal, SudokuSolverSessionBeanRemote  {
	
	@Override
	public Returnable compile(final String inputString) throws Exception {

		try {
			String[] inputArray= inputString.split(",");
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			
			return builderblePuzzel.getResult();
		} catch (Exception e) {
			return new ErrorReturnDTO();
		}
	}
}
