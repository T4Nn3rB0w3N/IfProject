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
		askUser();
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
		Lifting userLift = new Lifting();
		
		//ask
		String userLiftType = JOptionPane.showInputDialog(null, "What type of lift will you be doing?");
		String userWeight = JOptionPane.showInputDialog(null, "What is the weight in pounds?");
		String userReps = JOptionPane.showInputDialog(null, "How many reps will you do?");
		String userPercentMaxRep = JOptionPane.showInputDialog(null, "What is the percent of your max rep will you be lifting");
		
		
		//repeat until finished correctly
		while (!validInt(userWeight))
		{
			userWeight = JOptionPane.showInputDialog(null, "No! Type in a valid number for weight");
		}
		
		while (!validInt(userReps))
		{
			userReps = JOptionPane.showInputDialog(null, "You must use a valid integer number for reps");
		}
		
		while (!validInt(userPercentMaxRep))
		{
			userPercentMaxRep = JOptionPane.showInputDialog(null, "You must use a valid integer to represent percent of max rep");
		}
		
		//assign
		userLift.setLiftType(userLiftType);
		userLift.setWeight(Integer.parseInt(userWeight));
		userLift.setReps(Integer.parseInt(userReps));
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
