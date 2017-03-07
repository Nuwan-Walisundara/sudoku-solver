/*******************************************************************
*  NineByNinePuzzelBuilderble
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : Concrete implementation of 9 * 9
*******************************************************************/
package com.pb.codechallenge.ejb.ninebynine;

import com.pb.codechallenge.ejb.PuzzelBuilderble;
import com.pb.codechallenge.exception.ERROR;
import com.pb.codechallenge.exception.SudokuException;
import com.pb.codechallenge.model.SolutionDTO;

public class NineByNinePuzzelBuilderble implements PuzzelBuilderble {
	private Puzzle _puzzle;
	private RowValidator _rowValidator;
	private ColumnValidator _columnValidator;
	private ThreeByThreeValidator _3X3Validator;
	
	public NineByNinePuzzelBuilderble(){
		_puzzle = new Puzzle();
		_rowValidator = new RowValidator(_puzzle);
		_columnValidator = new ColumnValidator(_puzzle);
		_3X3Validator =new ThreeByThreeValidator(_puzzle);
	}
	
	@Override
	public void fill(String[] inputArray) throws SudokuException {
		if(inputArray.length!=81){
			throw new SudokuException(ERROR.INVALID_INPUT);
		}
		
		for (byte x = 0; x < inputArray.length; x+=9) {
			  byte row=(byte)(x/9);
			for (byte y = 0; y < 9; y++) {
				_puzzle.fill(row, y, inputArray[x+y]);
			}
		}
		
		
	}

	@Override
	public SolutionDTO getResult() throws SudokuException {
	 	_rowValidator.validate(); //validate row by row 
		_columnValidator.validate();  //validate column by column
		_3X3Validator.validate(); //validate 3*3 cells
		SolutionDTO solution= new SolutionDTO();
		
		solution.setSolution(_puzzle.toString());
		
		return solution;
	}

}
