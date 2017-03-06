package com.pb.codechallenge.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.pb.codechallenge.ejb.Returnable;
@XmlRootElement
public class SolutionDTO implements Returnable{

	private String solution;
	

	public String getSolution() {
		return solution;
	}


	public void setSolution(String solution) {
		this.solution = solution;
	}


	public String toString(){
		return solution;
	}
}
