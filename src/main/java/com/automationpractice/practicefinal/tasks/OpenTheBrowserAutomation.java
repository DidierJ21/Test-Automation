package com.automationpractice.practicefinal.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;

import com.automationpractice.practicefinal.exceptions.NoConectionWeb;
import com.automationpractice.practicefinal.questions.FailConectionInternet;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
public class OpenTheBrowserAutomation implements Task
{
	   private PageObject page;
	   public OpenTheBrowserAutomation(PageObject page)
	   {
		   this.page=page;
		 
	   }
	   @Override
	   @Step ("{0} open the browser on Automation Practice Home Page")
		public <T extends Actor> void performAs(T actor)
	   {
		   // TODO Auto-generated method stub
		   actor.attemptsTo(Open.browserOn(page));
		   page.getDriver().manage().window().maximize();
		   //page.setWaitForTimeout(10);
		   //actor.attemptsTo(Click.on(AutomationPracticeComponents.SEARCLOGO));
		   actor.should(seeThat(FailConectionInternet.conected(),hasItem("Contact us")).orComplainWith(NoConectionWeb.class,NoConectionWeb.NOCONECTED));		
		   //actor.should(seeThat(FailConectionInternet.conected(),hasItem("header_logo")).orComplainWith(NoConectionWeb.class,NoConectionWeb.NOCONECTED));
	   }

	public static OpenTheBrowserAutomation on (PageObject page) {
		// TODO Auto-generated method stub
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowserAutomation.class,page);
		//Instrumented port debsjo llama el condtructor de la clase que se ajuste a los parametros
		//return new openthebrowser(page)
	}
	

}
