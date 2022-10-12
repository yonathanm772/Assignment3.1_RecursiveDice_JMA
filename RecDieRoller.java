/**
 * Simulates the throw of a die until you get the desired number.
 * @author Jonathan Moreira Alsina
 * @version 10/11/2022
 */
import java.util.Random;

public class RecDieRoller {
	
	private int numTries;
	private int randDieFace;
	private double totalTries=0.0;

	Random rand = new Random();
	
	/**
	 * Default constructor 
	 */
	public RecDieRoller()
	{
		
		randDieFace=0;
		numTries = 0;
	}
	
	/**
	 * Simulates the roll of a die recursively until you get the desired number 
	 * @param desiredFace of integer type
	 * @return face of a die as an integer type
	 */
	public int roll(int desiredFace)
	{	
		randDieFace= (int)(Math.random()*(6)+1);  
		numTries++;
		totalTries++;
		if(randDieFace != desiredFace)
		{	
			System.out.print(randDieFace +",");
			return roll(desiredFace);
		}
		else
			 System.out.print("\nIt took "+ numTries +" tries before getting the desired face: ");
			 numTries=0;
			 return desiredFace;
		
			
	}
	
	/**
	 * Computes the mean amount of roles it takes to get a desired number over a definite amount of throws 
	 * @param totalAmountRolls
	 * @return mean as a double 
	 */
	public double meanCase(int totalAmountRolls) {
		return totalTries/totalAmountRolls;
	}
}
