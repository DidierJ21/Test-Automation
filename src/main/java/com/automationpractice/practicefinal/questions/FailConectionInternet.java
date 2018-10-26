package com.automationpractice.practicefinal.questions;

import java.util.List;

import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FailConectionInternet implements Question<List<String>>
{
	@Override
	public List<String> answeredBy(Actor actor)
	{
		// TODO Auto-generated method stub
		return Text.of(AutomationPracticeComponents.SEARCLOGO).viewedBy(actor).asList();
	}
	
	public static FailConectionInternet conected()
	{
		return new FailConectionInternet();
	}
}
