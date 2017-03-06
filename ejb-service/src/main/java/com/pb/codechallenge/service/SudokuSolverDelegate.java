package com.pb.codechallenge.service;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.pb.codechallenge.ejb.Returnable;
import com.pb.codechallenge.ejb.SudokuSolverSessionBeanRemote;


public class SudokuSolverDelegate {
	InitialContext ctx;
	SudokuSolverSessionBeanRemote remote;
	
	{
		try {
			Properties props = new Properties();

			/*props.setProperty("java.naming.factory.initial",
					"com.sun.enterprise.naming.SerialInitContextFactory");

			props.setProperty("java.naming.factory.url.pkgs",
					"com.sun.enterprise.naming");

			props.setProperty("java.naming.factory.state",
					"com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
*/
			ctx =  new InitialContext();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public SudokuSolverDelegate()throws Exception{
		remote = (SudokuSolverSessionBeanRemote) ctx 	.lookup("ejb/SudokuSolverSessionBean");
	}
	
	public Returnable compleInput(final String input)throws Exception{
		return remote.compile(input);
	}
	
}
