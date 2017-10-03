package view;

import javax.swing.JOptionPane;

/**
 * Simple GUI class using JOptionPane.
 * @author Aaron Montoya
 * @version 1.0 10.03.2017
 */
public class Display
{
	/**
	 * Displays a popup showing the supplied String to the user
	 * @param textToDisplay The Text to be displayed.
	 */
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	/**
	 * Uses a popup to display a question to the user and turns their response as a String.
	 * @param fromQuestion The question being asked.
	 * @return The users response to the question
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}
}
