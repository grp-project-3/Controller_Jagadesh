package com.controller;

public class UpdateFareException extends Exception {
	
	
	public UpdateFareException()
	{
		super("fare with id not found");
	}
	@Override
	public String toString() {
		return "fare with id \"+id+\" not found";
	}
	
	

}
