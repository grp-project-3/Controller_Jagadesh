package com.controller;

public class DeleteFlightException extends Exception {
	
	private int id;
	public DeleteFlightException(int id)
	{
		super("flight with id "+id+" not found");
		this.id=id;
	}
	
	
}
