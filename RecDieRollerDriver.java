
public class RecDieRollerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 1000;
		RecDieRoller newDie= new RecDieRoller();
		
		for( int count = 0; count < MAX; count++)
			System.out.println(newDie.roll(2));
			
		System.out.println(" The mean case is: " + newDie.meanCase(MAX));
	}

}
