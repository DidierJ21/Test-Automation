package com.automationpractice.practicefinal.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCart implements Task
{
//	private String AddToCart;
//	
//	 public AddToCart(String AddCart) 
//	 {
//		this.AddToCart = AddCart;
//	 }

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		 actor.attemptsTo(Click.on(AutomationPracticeComponents.ADDCART));
		
	}
	
	public static AddToCart the()
	{
		// TODO Auto-generated method stub
		return instrumented(AddToCart.class);	
	}

}
