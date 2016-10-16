public class Puzzle {

	private String puzzleName;

	private String description;

	private KeyItem keyAnswer;

	private boolean solved;

	private String logicAnswer;


	public Puzzle(String puzzleName, String description)
	{
		this.puzzleName = puzzleName;
		this.description = description;
		
	}


	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}


	/**
	 * @return the puzzleID
	 */
	public String getPuzzleName()
	{
		return puzzleName;
	}


	/**
	 * @param puzzleID the puzzleID to set
	 */
	public void setPuzzleName(String puzzleName)
	{
		this.puzzleName = puzzleName;
	}


	/**
	 * @return the keyAnswer
	 */
	public KeyItem getKeyAnswer()
	{
		return keyAnswer;
	}


	/**
	 * @param keyAnswer the keyAnswer to set
	 */
	public void setKeyAnswer(KeyItem keyAnswer)
	{
		this.keyAnswer = keyAnswer;
	}


	/**
	 * @return the solved
	 */
	public boolean isSolved()
	{
		return solved;
	}


	/**
	 * @param solved the solved to set
	 */
	public void setSolved(boolean solved)
	{
		this.solved = solved;
	}


	/**
	 * @return the logicAnswer
	 */
	public String getLogicAnswer()
	{
		return logicAnswer;
	}


	/**
	 * @param logicAnswer the logicAnswer to set
	 */
	public void setLogicAnswer(String logicAnswer)
	{
		this.logicAnswer = logicAnswer;
	}
	
}
