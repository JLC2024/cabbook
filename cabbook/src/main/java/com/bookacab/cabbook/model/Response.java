package com.bookacab.cabbook.model;
import java.util.List;



public class Response {
	

	String message;
	List<Cabs> cabs;
	
	public Response() {
		
	}
	public Response(String message, List<Cabs> cabs) {
		super();
		this.message=message;
		this.cabs=cabs;
	}
	
	public Response(String message) {
		
		this.message=message;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public List<Cabs> getCabs() {
		return cabs;
	}

	public void setProducts(List<Cabs> cabs) {
		this.cabs = cabs;
	}
	@Override
	public String toString() {
		return "Response [message=" + message + ", cabs=" + cabs + "]";
	}
	
}
