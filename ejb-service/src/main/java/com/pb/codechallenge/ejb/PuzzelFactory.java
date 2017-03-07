/*******************************************************************
*  PuzzelFactory
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : Depending on the puzzel type the factory load the implimentaion
*******************************************************************/
package com.pb.codechallenge.ejb;

import com.pb.codechallenge.ejb.ninebynine.NineByNinePuzzelBuilderble;
import com.pb.codechallenge.exception.ERROR;
import com.pb.codechallenge.exception.SudokuException;
import com.pb.codechallenge.util.PuzzelType;

public class PuzzelFactory {

	public static PuzzelBuilderble createPuzzelBulder(PuzzelType type)throws SudokuException{
		PuzzelBuilderble returnBuilder=null;
		
		switch (type) {
		case NINEBYNINE:
			returnBuilder = new NineByNinePuzzelBuilderble();
			break;
		default:
			throw new SudokuException(ERROR.UNSUPORTED_PUZZELTYPE);
			
		}
		return returnBuilder;
	}
}
