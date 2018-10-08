package model;

public class Lifting
{
	//Declaration section, or data member section. Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null!!!
	//--------DATA MEMBERS-----------
	private int weight;
	private int reps;
	private int percentMaxRep;
	private int sets;
	private String liftType;
	//-----------END---------------
	
	/**
	 * Default constructor for after the fact customization
	 * AKA I don't know the info yet
	 * Initializing data members with "bad" values to be changed.
	 */
	public Lifting()
	{
		
	}
	
	/**
	 * Better constructor when I know information for the Lifting object.
	 * @param liftType The type of lift that's being used.
	 * @param weight The amount of weight being lifted.
	 * @param reps The number of completions of the lift.
	 * @param percentMaxRep The intensity of the lift that compares the weight being lifted to the maximum amount of weight that can be done in one completion.
	 * @param sets The amount of completions in one sitting
	 */
	public Lifting(String liftType, int weight, int reps, int percentMaxRep, int sets)
	{
		this.liftType = liftType;
		this.weight = weight;
		this.reps = reps;
		this.percentMaxRep = percentMaxRep;
		this.sets = sets;
	}
	
	//------------SETTERS-----------------
	public void setLiftType(String liftType)
	{
		this.liftType = liftType;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public void setReps(int reps)
	{
		this.reps = reps;
	}
	
	public void setPercentMaxRep(int percentMaxRep)
	{
		this.percentMaxRep = percentMaxRep;
	}
	
	public void setSets(int sets)
	{
		this.sets = sets;
	}
	//---------END-----------
	
	//------GETTERS-----------
	public String getLiftType()
	{
		return liftType;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int getReps()
	{
		return reps;
	}
	
	public int getPercentMaxRep()
	{
		return percentMaxRep;
	}
	
	public int getSets()
	{
		return sets;
	}
	//---------END--------------
	
	public String toString()
	{
		String description = "You're going to do " + reps + " reps of " 
								+ liftType + " for " + sets + " sets, using "
								+ weight + " pounds, " + percentMaxRep + " percent of your max rep. GOOD LUCK!";
		return description;
	}
}
