import java.util.Random;


/**
 * @author revouyt
 * Class that describes a code
 */
public class Code {
	
	/**
	 * Capacity of the case
	 */
	public final static int LENGTH_OF_THE_CODE = 4;
	
	
	/**
	 * attribute that refers to the code
	 */
	private ColorCodePegs[] Codeline ;

	
	/**
	 * Builder of a code which have 4 case that contains ColorKeyPeg
	 */
	public Code() {
		this.Codeline = new ColorCodePegs[LENGTH_OF_THE_CODE];
		for (int Numero=0;Numero <= LENGTH_OF_THE_CODE ;Numero++)
			this.Codeline[Numero] = ColorCodePegs.getRandom() ;
		    
	
		
	}
}
