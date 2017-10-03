package controller;

import java.util.List;
import java.util.ArrayList;
import model.Kahoot;

public class Controller
{
	private List<Kahoot> myKahoots;
	
	public Controller()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
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
