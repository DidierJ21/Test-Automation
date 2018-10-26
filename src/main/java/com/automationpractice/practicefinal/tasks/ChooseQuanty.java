package com.automationpractice.practicefinal.tasks;

import com.automationpractice.practicefinal.models.CaracteristicsArticleModel;
import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class ChooseQuanty implements Task
{
	private CaracteristicsArticleModel caracteristicsarticlemodel;
	
    public ChooseQuanty(CaracteristicsArticleModel Caracteristics) 
    {
    	this.caracteristicsarticlemodel=Caracteristics;
    }
	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(caracteristicsarticlemodel.getQuantity()).into(AutomationPracticeComponents.QUANTY));
				
	}
	public static ChooseQuanty the(CaracteristicsArticleModel caracteristicsarticlemodel) 
	{
		// TODO Auto-generated method stub
		return Tasks.instrumented(ChooseQuanty.class,caracteristicsarticlemodel);
	}
	
}