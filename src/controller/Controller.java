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
		for(int index = 0; index < myKahoots.size(); index++)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	
	
	/**
	 * Method that fills the myKahoots list with 5 Kahoots
	 */
	private void fillTheList()
	{
		Kahoot kahootWithName = new Kahoot("Aaron", 7);
		Kahoot defaultKahoot = new Kahoot();
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 19);
		Kahoot theEpilogue = new Kahoot("KahootBot", 1);
		myKahoots.add(kahootWithName);
		myKahoots.add(defaultKahoot);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(theEpilogue);
	}
}
