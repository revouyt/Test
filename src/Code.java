import java.util.Random;


/**
 * @author revouyt
 * Class that describes a code
 */
public class Code {
	
	private int Result=0;

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
		this.CodeToFind = new ColorCodePegs[LENGTH_OF_THE_CODE];
		for (int Number=0;Number <= LENGTH_OF_THE_CODE ;Number++)
			this.Codeline[Number] = ColorCodePegs.getRandom();
		for (int Numb=0;Numb <= LENGTH_OF_THE_CODE ;Numb++)
			this.CodeToFind[Numb] = ColorCodePegs.getRandom();
	}
	public int   compareCodes (Code Codeline,Code CodeToFind) 	   
		{
		int Numb=0;
		int Number=0;
		while (CodeToFind != Codeline)
		{
			if (Numb == Number)
				{
				Result++;
				Number++;
				}
			Numb++;
		}
		 
		return Result;
		}
	
}
	
	
	

