package com.pb.codechallenge.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.pb.codechallenge.ejb.Returnable;
@XmlRootElement
public class ErrorReturnDTO implements Returnable {
	private String error="cannot be completed";

	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}


	public String toString(){
		return error;
	}
}
