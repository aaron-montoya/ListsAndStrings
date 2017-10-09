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
//		showTheList();
//		changeTheList();
		listPractice();
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
			
			String topic = current_kahoot.getTopic();
			for(int letter = topic.length() -1; letter >= 0; letter--)
			{
				popup.displayText(topic.substring(letter, letter + 1));
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
	
	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoots.size() + " Kahoots");
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The list now has: " + myKahoots.size() + " Kahoots");
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " Kahoots");
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("The Kahoot by " + removed.getCreator() + " was replaced with one by " + myKahoots.get(2).getCreator());
	}
	
	private void listPractice()
	{
		for(int loop = 0; loop < myKahoots.size(); loop++)
		{
			popup.displayText("'" + myKahoots.get(loop).getCreator() + "' created this Kahoot.");
		}
		
		Kahoot removed_kahoot = myKahoots.remove(2);
		myKahoots.add(removed_kahoot);
		popup.displayText("Moved '" + removed_kahoot + "' to the end of the list");
		
		for(int looping = 0; looping < myKahoots.size(); looping++)
		{
			popup.displayText("'" + myKahoots.get(looping).getCreator() + "' created this Kahoot.");
		}
		
		removed_kahoot.setCreator("Bob");
		popup.displayText("Set the creator of the kahoot to 'Bob'");
		
		for(int loop = 0; loop < myKahoots.size(); loop++)
		{
			popup.displayText("'" + myKahoots.get(loop).getCreator() + "' created this Kahoot.");
		}
	}

	public Display getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
}












