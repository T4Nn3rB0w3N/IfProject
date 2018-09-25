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
			if (count >= 10)
			{
				isDone = true;  //update variable
			}
		}	
	}
}
