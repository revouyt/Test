/**
 * class that represents what happen during a game of MasterMind
 * @author revouyt
 * 
 */
public class GameOfMasterMind {

	/**
	 * Capacity of the case
	 */
	public final static int LENGTH_OF_THE_CODE = 4;
	
	/**
	 * constant represents the numbers of tests allowed to find the code
	 */
	public final static int NUMBER_OF_TESTS=12;
	
	
	
	/**
	 *  Represents the code that the player have to find
	 */
	private Code CodeToFind;
	
	/**
	 * represents the player of the game of MasterMind
	 */
	private Player PlayerOne;
	
	
	
	/**
	 * Constructor of a game of MasterMind
	 */
	public GameOfMasterMind()
	{
		Code CodeToFind = new Code();
		Player PlayerOne = new Player();
		for (int test=0;this.PlayerOne.codePlayer == this.CodeToFind  && test <=  NUMBER_OF_TESTS ;test++)
			for (int Number=0;Number <= LENGTH_OF_THE_CODE;Number++)
					Code this.PlayerOne.codePlayer = new Code();
		
	}
	
	/**
	 *  method that describes how a game of MasterMind works
	 */
	public void play()
	{
	
		for (int test=0;this.PlayerOne.codePlayer == this.CodeToFind  && test <=  NUMBER_OF_TESTS ;test++)
			for (int Number=0;Number <= LENGTH_OF_THE_CODE;Number++)
				Code PlayerOne.codePlayer = new Code();
		EndOfTheGame();
	}
		
		
			
	
	/**
	 *  represents what happen at the end of a game of MasterMind
	 *  
	 */
	 
	public boolean EndOfTheGame()
	{
		if (getCounterColorKeyPegsRed() == LENGTH_OF_THE_CODE)
			return true;
		return false;
			
	}
}
