package controller;

import java.util.List;
import java.util.ArrayList;
import model.Kahoot;
import view.Display;

public class Controller
{
	private List<Kahoot> myKahoots;
	private Display popup;
	
	public Controller()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new Display();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		
		fillTheList();
		showTheList();
	}
	
	
	/**
	 * Uses a for loop to print out the array to popup windows
	 */
	private void showTheList()
	{
		String current_creator = "";
		for(int index = 0; index < myKahoots.size(); index++)
		{
			current_creator = myKahoots.get(index).getCreator();
			
			Kahoot current_kahoot = myKahoots.get(index);
			String creator = current_kahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if(current_creator.equals("Nobody"))
			{
				for(int loop = 0; loop < 5; loop++)
				{
					popup.displayText("Wow nobody does a lot!");
				}
			}
			
			for(int current_letter_index = 0; current_letter_index < creator.length(); current_letter_index++)
			{
				popup.displayText(current_creator.substring(current_letter_index, current_letter_index + 1));
			}
		}
	}
	
	
	/**
	 * Method that fills the myKahoots list with 5 Kahoots
	 */
	private void fillTheList()
	{
		Kahoot kahootWithName = new Kahoot("Aaron", 7, "All the colours of the animals");
		Kahoot defaultKahoot = new Kahoot();
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 19, "The Double data type");
		Kahoot theEpilogue = new Kahoot("KahootBot", Integer.MAX_VALUE, "Everything - Literally");
		myKahoots.add(kahootWithName);
		myKahoots.add(defaultKahoot);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(theEpilogue);
	}
}
