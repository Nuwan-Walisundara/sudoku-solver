package com.pb.codechallenge.ejb.ninebynine;

import org.apache.commons.lang3.StringUtils;

import com.pb.codechallenge.exception.ERROR;
import com.pb.codechallenge.exception.SudokuException;

class Puzzle {

	private final byte COLUMN_FIRST_INDEX = 0;
	private final byte COLUMN_SECOND_INDEX = 1;
	private final byte COLUMN_THIRED_INDEX = 2;
	private final byte COLUMN_FORTH_INDEX = 3;

	private final byte COLUMN_FIFTH_INDEX = 4;
	private final byte COLUMN_SIXTH_INDEX = 4;
	private final byte COLUMN_SEVENTH_INDEX = 6;
	private final byte COLUMN_EIGHTTH_INDEX = 6;
	private final byte COLUMN_NINTH_INDEX = 8;

	private final byte ROW_FIRST_INDEX = 0;
	private final byte ROW_2ND_INDEX = 1;
	private final byte ROW_THIRD_INDEX = 2;
	private final byte ROW_FORTH_INDEX = 3;
	private final byte ROW_FIFTH_INDEX = 4;
	private final byte ROW_SIXTH_INDEX = 5;
	private final byte ROW_SEVENTH_INDEX = 6;
	private final byte ROW_EIGHTH_INDEX = 7;
	private final byte ROW_NINTH_INDEX = 8;
	public final byte TOTAL =45;
	
	byte[][] sudoku;

	Puzzle() {
		this.sudoku = init();
	}

	private byte[][] init() {
		sudoku = new byte[9][9];
		// First row
		sudoku[ROW_FIRST_INDEX][COLUMN_FIRST_INDEX] = 4;
		sudoku[ROW_FIRST_INDEX][COLUMN_SECOND_INDEX] = 3;
		sudoku[ROW_FIRST_INDEX][COLUMN_THIRED_INDEX] = 5;
		sudoku[ROW_FIRST_INDEX][COLUMN_SIXTH_INDEX] = 9;
		sudoku[ROW_FIRST_INDEX][COLUMN_EIGHTTH_INDEX] = 8;

		// Second ROW
		sudoku[ROW_2ND_INDEX][COLUMN_THIRED_INDEX] = 2;
		sudoku[ROW_2ND_INDEX][COLUMN_FORTH_INDEX] = 5;
		sudoku[ROW_2ND_INDEX][COLUMN_SIXTH_INDEX] = 1;
		sudoku[ROW_2ND_INDEX][COLUMN_SEVENTH_INDEX] = 4;
		sudoku[ROW_2ND_INDEX][COLUMN_NINTH_INDEX] = 3;

		// Third ROW
		sudoku[ROW_THIRD_INDEX][COLUMN_THIRED_INDEX] = 7;
		sudoku[ROW_THIRD_INDEX][COLUMN_FORTH_INDEX] = 8;
		sudoku[ROW_THIRD_INDEX][COLUMN_FIFTH_INDEX] = 3;
		sudoku[ROW_THIRD_INDEX][COLUMN_EIGHTTH_INDEX] = 6;
		sudoku[ROW_THIRD_INDEX][COLUMN_NINTH_INDEX] = 2;

		// Forth Row
		sudoku[ROW_FORTH_INDEX][COLUMN_THIRED_INDEX] = 6;
		sudoku[ROW_FORTH_INDEX][COLUMN_FIFTH_INDEX] = 9;
		sudoku[ROW_FORTH_INDEX][COLUMN_SIXTH_INDEX] = 5;
		sudoku[ROW_FORTH_INDEX][COLUMN_SEVENTH_INDEX] = 3;
		sudoku[ROW_FORTH_INDEX][COLUMN_NINTH_INDEX] = 7;

		// Fifth Row
		sudoku[ROW_FIFTH_INDEX][COLUMN_FIRST_INDEX] = 3;
		sudoku[ROW_FIFTH_INDEX][COLUMN_SECOND_INDEX] = 7;
		sudoku[ROW_FIFTH_INDEX][COLUMN_FIFTH_INDEX] = 8;
		sudoku[ROW_FIFTH_INDEX][COLUMN_EIGHTTH_INDEX] = 1;
		sudoku[ROW_FIFTH_INDEX][COLUMN_NINTH_INDEX] = 5;

		// Sixth Row
		sudoku[ROW_SIXTH_INDEX][COLUMN_FIRST_INDEX] = 9;
		sudoku[ROW_SIXTH_INDEX][COLUMN_THIRED_INDEX] = 1;
		sudoku[ROW_SIXTH_INDEX][COLUMN_FORTH_INDEX] = 7;
		sudoku[ROW_SIXTH_INDEX][COLUMN_FIFTH_INDEX] = 4;
		sudoku[ROW_SIXTH_INDEX][COLUMN_SEVENTH_INDEX] = 6;

		// Seventh Row
		sudoku[ROW_SEVENTH_INDEX][COLUMN_FIRST_INDEX] = 5;
		sudoku[ROW_SEVENTH_INDEX][COLUMN_SECOND_INDEX] = 1;
		sudoku[ROW_SEVENTH_INDEX][COLUMN_FIFTH_INDEX] = 2;
		sudoku[ROW_SEVENTH_INDEX][COLUMN_SIXTH_INDEX] = 6;
		sudoku[ROW_SEVENTH_INDEX][COLUMN_SEVENTH_INDEX] = 8;

		// Eighth Row
		sudoku[ROW_EIGHTH_INDEX][COLUMN_FIRST_INDEX] = 2;
		sudoku[ROW_EIGHTH_INDEX][COLUMN_THIRED_INDEX] = 2;
		sudoku[ROW_EIGHTH_INDEX][COLUMN_FORTH_INDEX] = 9;
		sudoku[ROW_EIGHTH_INDEX][COLUMN_SIXTH_INDEX] = 7;
		sudoku[ROW_EIGHTH_INDEX][COLUMN_SEVENTH_INDEX] = 1;

		// NINTH Row
		sudoku[ROW_NINTH_INDEX][COLUMN_SECOND_INDEX] = 6;
		sudoku[ROW_NINTH_INDEX][COLUMN_FORTH_INDEX] = 4;
		sudoku[ROW_NINTH_INDEX][COLUMN_SEVENTH_INDEX] = 2;
		sudoku[ROW_NINTH_INDEX][COLUMN_EIGHTTH_INDEX] = 5;
		sudoku[ROW_NINTH_INDEX][COLUMN_NINTH_INDEX] = 9;

		return sudoku;
	}

	/**
	 * @param args
	 */
	public void print() {

		for (byte x = 0; x < 9; x++) {

			System.out.print("[");

			for (byte j = 0; j < 9; j++) {
				if (j > 0) {
					System.out.print(",");
				}
				if (sudoku[x][j] > 0) {
					System.out.print(sudoku[x][j]);
				} else {
					System.out.print('X');
				}
			}

			System.out.println("]");
		}

	}

	public void fill(byte rowIndex, byte columnIndex,String strValue ) throws SudokuException {
		
		if(strValue.trim().equalsIgnoreCase("x")){
			return;
		}
		
		byte value = Byte.valueOf(strValue.trim());
		
		if (sudoku[rowIndex][columnIndex] == value  ) {
			return;
		} 
		
		if (sudoku[rowIndex][columnIndex] > 0 || value > 0) {
			sudoku[rowIndex][columnIndex] = value;
		} else {
			throw new SudokuException(ERROR.INVALID_FILL);
			
		}
	}
	
	public byte[][] getArray(){
		return this.sudoku;
	}
	public String toString(){
		 String retunStr=null;
		 retunStr = StringUtils.join(sudoku[0], ',')+","
				 	+  StringUtils.join(sudoku[1], ',')+","
				 	+ StringUtils.join(sudoku[2], ',')+","
				 	+ StringUtils.join(sudoku[3], ',')+","
				 	+ StringUtils.join(sudoku[4], ',')+","
				 	+ StringUtils.join(sudoku[5], ',')+","
				 	+ StringUtils.join(sudoku[6], ',')+","
				 	+ StringUtils.join(sudoku[7], ',')+","
				 	+ StringUtils.join(sudoku[8], ',');
		 return retunStr;
	}
}
