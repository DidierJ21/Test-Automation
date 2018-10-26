package com.automationpractice.practicefinal.exceptions;

public class NoConectionWeb extends AssertionError
{
	 public static final String NOCONECTED="No connection to internet please verify your red";
	   
	   public NoConectionWeb (String message,Throwable cause) 
	   {
		   super(message,cause);
	   }

}