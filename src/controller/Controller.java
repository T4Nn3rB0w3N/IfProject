package controller;

//Import Section
import model.Lifting;
import javax.swing.JOptionPane;

public class Controller
{
	/**
	 * Builds the instance of the Controller
	 */
	public Controller()
	{
		
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		loopy();
	}
	
	private void loopy()
	{
		//Define variable before loop
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)//Test the variable
		{
			JOptionPane.showMessageDialog(null,  "brother may I have some looops??");
			//Eventually change the loop variable
			count++;
			if (count >= 1)
			{
				isDone = true;  //update variable
			}
		}
		for (int loop = 0; loop < 30; loop += 2)
		{
			JOptionPane.showMessageDialog(null, "The loop value is: " + loop);
		}
	}
	
	private void askUser()
	{
		String response = JOptionPane.showInputDialog, "What is the distance???");
		
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for distqnce");
		}
		
		
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >)");
		}
		
		
		return isValid;
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,  "You should type a integer value like -12345");
		}
		
		return isValid;
	}
}
