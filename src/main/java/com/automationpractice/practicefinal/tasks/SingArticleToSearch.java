package com.automationpractice.practicefinal.tasks;

import com.automationpractice.practicefinal.models.NameArticleModel;
import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class SingArticleToSearch implements Task
{
private NameArticleModel namearticlemodel;
	
    public SingArticleToSearch(NameArticleModel Name) 
    {
    	this.namearticlemodel=Name;
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(namearticlemodel.getArticle()).into(AutomationPracticeComponents.SEARCHAREA));				
	}

	public static SingArticleToSearch the(NameArticleModel namearticlemodel) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SingArticleToSearch.class,namearticlemodel);
	}

}

