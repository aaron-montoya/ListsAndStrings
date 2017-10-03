package model;

public class Kahoot
{
	private int question_count;
	private int level;
	private String creator;
	private boolean isJumble;

	/**
	 * Make a default Kahoot
	 */
	public Kahoot()
	{
		this.question_count = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
	}
	
	/**
	 * Set the parameters to the data values
	 * @param creator
	 * @param question_count
	 */
	public Kahoot(String creator, int question_count)
	{
		this.creator = creator;
		this.question_count = question_count;
	}
}
