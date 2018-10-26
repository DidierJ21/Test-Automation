package com.automationpractice.practicefinal.tasks;

import com.automationpractice.practicefinal.models.CaracteristicsArticleModel;
import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ChooseSize implements Task
{
private CaracteristicsArticleModel caracteristicsarticlemodel;
	
    public ChooseSize(CaracteristicsArticleModel Caracteristics) 
    {
    	this.caracteristicsarticlemodel=Caracteristics;
    }

	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		// TODO Auto-generated method stub
		actor.attemptsTo(SelectFromOptions.byValue(caracteristicsarticlemodel.getSize()).from(AutomationPracticeComponents.SIZE));
		
	}

	public static ChooseSize the(CaracteristicsArticleModel caracteristicsarticlemodel) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(ChooseSize.class,caracteristicsarticlemodel);
	}

}
