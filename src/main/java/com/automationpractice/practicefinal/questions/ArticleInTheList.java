package com.automationpractice.practicefinal.questions;

import java.util.List;

import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ArticleInTheList implements Question<Integer>
{
  
	@Override
	public Integer answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		 //Text.of(AutomationPracticeComponents.LISTNUM).viewedBy(actor).asList();
				String Yalet=Text.of(AutomationPracticeComponents.LISTNUM).viewedBy(actor).asString();
				String [] lala= Yalet.split(" ");
				int numero= Integer.parseInt(lala[5]);
				return numero;
	}
	
	public static ArticleInTheList Exist()
	{
		return new ArticleInTheList();
	}
}
