
/**
 * class that represents what happen during a game of MasterMind
 * @author revouyt
 * 
 */
public class GameOfMasterMind {

	
	/**
	 * constant represents the numbers of tests allowed to find the code
	 */
	public final static int NUMBER_OF_TESTS=12;
	
	/**
	 *  represents what we do during the game of MasterMind
	 */
	
	public void play ()
	{
		Code codeADeviner = new ColorCodePegs[4];
		Player Player = new Player();
		for (int test=0;Player.CodePlayer == codeADeviner  && test <=  NUMBER_OF_TESTS ;test++ )
			Code Player.CodePlayer = new ColorCodePegs[4];
		EndOfTheGame();
	}
		
		
			
	
	/**
	 *  represents what happen at this end of the game
	 *  
	 */
	public boolean EndOfTheGame()
	{
		if (CounterColorKeyPegsRed==4)
			return true;
		return false;
			
	}
}
