package com.controller;

public class DeleteFareException extends Exception {
	
	private int id;
	public DeleteFareException(int id)
	{
		super("fare with id "+id+" not found");
		this.id=id;
	}

}
