package com.pb.codechallenge.ejb.ninebynine;

import com.pb.codechallenge.exception.ERROR;
import com.pb.codechallenge.exception.ValidateExeception;

class ThreeByThreeValidator {
	private Puzzle puzzle;

	public ThreeByThreeValidator(Puzzle puzzle) {
		this.puzzle = puzzle;
	}

	public void validate() throws ValidateExeception {
		byte[][] array = puzzle.getArray();
		for (byte x = 0; x < 9; x += 3) { // 3 * 3 iterate over column/x axis
			for (byte y = 0; y < 9; y += 3) {// 3 * 3 iterate over row/y axis

				byte count = 0;// reset column count at each column

				for (byte j = 0; j < 3; j++) {
					for (byte k = 0; k < 3; k++) {

						if (count + array[k + y][j + x] > puzzle.TOTAL) { // if
																			// puzzle
																			// total
																			// already
																			// exceed
							throw new ValidateExeception(ERROR.INVALID_COUNT);
						} else {
							count += array[k + y][j + x];
						}

					}

				}

				if (count != puzzle.TOTAL) { // if
					// puzzle
					// total
					// already
					// exceed
					throw  new ValidateExeception(ERROR.INVALID_COUNT);
				}
			}
		}

	}
}
