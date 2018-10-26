package com.automationpractice.practicefinal.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import com.automationpractice.practicefinal.exceptions.ArticleNoExist;
import com.automationpractice.practicefinal.questions.ArticleInTheList;
import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class SearchClick implements Task
{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(AutomationPracticeComponents.SEARCHBUTTON));
		actor.attemptsTo(Click.on(AutomationPracticeComponents.RESULTLIST));
		//actor.attemptsTo(Click.on((Target)(SelectFromOptions.byIndex(3)).from(AutomationPracticeComponents.CHOOSEARTICLE)));
	    //Click.on(AutomationPracticeComponents.RESULTLIST));
		
	}
	public static SearchClick She() 
	{
		// TODO Auto-generated method stub
		return Tasks.instrumented(SearchClick.class);
	}
	
	
}
