package com.pb.codechallenge.ejb.ninebynine;

import com.pb.codechallenge.exception.ERROR;
import com.pb.codechallenge.exception.ValidateExeception;

class RowValidator {
	private Puzzle puzzle;
	public RowValidator(Puzzle puzzle) {
		this.puzzle=puzzle;
	}

	public void validate()throws ValidateExeception{
		byte[][]  array =puzzle.getArray();
		for(byte x=0;x<9;x++){
			byte count=0;//reset column count at each column
			for (byte j=0; j<9;j++){
				if(count + array[x][j]>puzzle.TOTAL){
					throw new ValidateExeception(ERROR.INVALID_COUNT);
				}else{
					count += array[x][j];
				}
			}
			
			if (count != puzzle.TOTAL) { // if
				// puzzle
				// total
				// already
				// exceed
				throw new ValidateExeception(ERROR.INVALID_COUNT);
			}
		}
	}
}
