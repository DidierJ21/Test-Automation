package com.automationpractice.practicefinal.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Choosecolor implements Task
{
	private String color;
	
	 public Choosecolor(String color) 
	 {
		this.color = color;
	 }

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(AutomationPracticeComponents.CHOOSECOLOR.of(color)));
	}

	public static Choosecolor the(String color)
	{
		// TODO Auto-generated method stub
		return instrumented(Choosecolor.class, color);	
	}
	

}
