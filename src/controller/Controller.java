package controller;

//Import Section
import model.Lifting;

import java.util.ArrayList;

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
		List();
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
			if (count >= 10)
			{
				isDone = true;  //update variable
			}
		}
		
		for (int loop = 1; loop <= 10; loop += 1)
		{
			askUser();
			JOptionPane.showMessageDialog(null, "This is the " + loop + "'th Lifting object I made");
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
		String userSets = JOptionPane.showInputDialog(null, "How many sets will you do?");
		
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
		
		while (!validInt(userSets))
		{
			userSets = JOptionPane.showInputDialog(null, "You must use a valid integer, human >:[");
		}
		
		//assign
		userLift.setLiftType(userLiftType);
		userLift.setWeight(Integer.parseInt(userWeight));
		userLift.setReps(Integer.parseInt(userReps));
		userLift.setPercentMaxRep(Integer.parseInt(userPercentMaxRep));
		userLift.setSets(Integer.parseInt(userSets));
		
		JOptionPane.showMessageDialog(null, userLift);
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
	
	private void List()
	{
		ArrayList<Lifting> myLifts = new ArrayList<Lifting>();
		
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		//Have to use a Wrapper class to hold a primitive (aka, number) in a list
		
		
		Lifting sampleLift = new Lifting();
		Lifting otherLift = new Lifting();
		/**
		 * @param sampleLift being added to the myLifts list
		 */
		myLifts.add(sampleLift);
		myLifts.add(sampleLift);
		myLifts.add(otherLift);
		
		//Standard forward loop
		//if used to remove you have to change index -=1
		/**
		 * size returns the number of the objects in the array list
		 */
		for (int index = 0; index < myLifts.size(); index +=1)
		{
			//Good for display, or minor changes
			/**
			 * returns the item in which the index is at
			 */
			JOptionPane.showMessageDialog(null, myLifts.get(index).getLiftType());
			
			//Good for remove, replace, change multiple values
			Lifting currentLift = myLifts.get(index);
			currentLift.setLiftType("The new name is " + index + " lift");
			currentLift.setWeight(index * (int) (Math.random() * 150));
		}
		
		//Standard backward loop
		//great for removing!!
		for (int index = myLifts.size() - 1; index >= 0; index -= 1)
		{
			
		}
		
		for (Lifting current : myLifts)
		{
			JOptionPane.showMessageDialog(null, "The lift is named: " + current.getLiftType());
		}
	}
}
