package view;

import javax.swing.JOptionPane;

public class Display
{
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}
}
