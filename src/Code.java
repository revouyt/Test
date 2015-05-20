import java.util.Random;


/**
 * @author revouyt
 * Class that describes a code
 */
public class Code {
	
	
	/**
	 * Count the number of CodePegs that are the right color but not at the right place
	 */
	private int CounterColorKeyPegsWhite;
	
	/**
	 * Count the number of CodePegs that are the right color at the right place
	 */
	private int CounterColorKeyPegsRed;
	

	/**
	 * Capacity of the case
	 */
	public final static int LENGTH_OF_THE_CODE = 4;
	
	
	/**
	 * attribute that refers to the code
	 */
	private ColorCodePegs[] Codeline ;
	private ColorCodePegs[] CodeToFind ;

	
	/**
	 * Builder of a code which have 4 case that contains ColorKeyPeg
	 */
	public Code() {
		this.Codeline = new ColorCodePegs[LENGTH_OF_THE_CODE];
		//this.CodeToFind = new ColorCodePegs[LENGTH_OF_THE_CODE];
		for (int Number=0;Number <= LENGTH_OF_THE_CODE ;Number++)
			this.Codeline[Number] = ColorCodePegs.getRandom();
		//for (int Numb=0;Numb <= LENGTH_OF_THE_CODE ;Numb++)
		//	this.CodeToFind[Numb] = ColorCodePegs.getRandom();
	}
	
		

	public int getNumberOfRedColorKeyPegs()
	{
		CounterColorKeyPegsRed = 0;
		for (int Number=0;Number <= LENGTH_OF_THE_CODE ;Number++)
			if (Codeline[Number] == CodeToFind[Number])
				CounterColorKeyPegsRed++;
		return CounterColorKeyPegsRed;
	}
	
	public int getNumberOfWhiteColorKeyPegs()
	{
		CounterColorKeyPegsWhite = 0;
		int Numb=0;
		for (int Number=0;Number <= LENGTH_OF_THE_CODE && Codeline[Number] != CodeToFind[Numb] ;Number++)
				for (Numb=0;Numb <= LENGTH_OF_THE_CODE ;Numb++)
					if (Codeline[Number] != CodeToFind[Numb])  
						CounterColorKeyPegsWhite++;
		
		return CounterColorKeyPegsWhite;
	}
}
	
	
	

