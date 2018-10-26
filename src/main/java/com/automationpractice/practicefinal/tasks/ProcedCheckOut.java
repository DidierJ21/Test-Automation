package com.automationpractice.practicefinal.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ProcedCheckOut implements Task
{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(AutomationPracticeComponents.PROCEEDCHECKOUT));
	}
	public static ProcedCheckOut the()
	{
		// TODO Auto-generated method stub
		return instrumented(ProcedCheckOut.class);	
	}
}
