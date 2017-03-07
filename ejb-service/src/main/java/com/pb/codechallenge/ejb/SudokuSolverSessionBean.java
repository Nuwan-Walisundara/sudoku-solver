/*******************************************************************
*  SudokuSolverSessionBean
* Author  : Nuwan Walisundara
* Created :  4-03-2017
*
* Description : Stateless sesion bean for  managing BL
*******************************************************************/
package com.pb.codechallenge.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pb.codechallenge.model.ErrorReturnDTO;
import com.pb.codechallenge.util.PuzzelType;

@Stateless(name = "SudokuSolverSessionBean", mappedName = "ejb/SudokuSolverSessionBean")
@Local( SudokuSolverSessionBeanLocal.class  )
@Remote( SudokuSolverSessionBeanRemote.class )
public class SudokuSolverSessionBean implements SudokuSolverSessionBeanLocal, SudokuSolverSessionBeanRemote  {
	Log LOG = LogFactory.getLog(SudokuSolverSessionBean.class);
	@Override
	public Returnable compile(final String inputString) throws Exception {
		LOG.info("inputString :"+inputString);
		try {
			String[] inputArray= inputString.split(",");
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			
			return builderblePuzzel.getResult();
		} catch (Exception e) {
			LOG.error("",e);
			return new ErrorReturnDTO();
		}
	}
}
