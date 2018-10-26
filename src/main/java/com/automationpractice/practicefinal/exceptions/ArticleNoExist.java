package com.automationpractice.practicefinal.exceptions;

public class ArticleNoExist extends AssertionError
{
	 public static final String NOEXIST="Article not is in the list";
	    
	   public ArticleNoExist (String message,Throwable cause) 
	   {
		   super(message,cause);
	   }
}
