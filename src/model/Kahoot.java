package model;

public class Kahoot
{
	private int question_count;
	private int level;
	private String creator;
	private boolean isJumble;
	private String topic;

	/**
	 * Make a default Kahoot
	 */
	public Kahoot()
	{
		this.question_count = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
		this.topic = "Some Topic";
	}
	
	/**
	 * Set the parameters to the data values
	 * @param creator
	 * @param question_count
	 */
	public Kahoot(String creator, int question_count, String topic)
	{
		this();
		this.creator = creator;
		this.question_count = question_count;
		this.topic = topic;
	}
	
	public String toString()
	{
		String desc = "This Kahoot was made by " + creator + ". The topic is '" + topic + "' and it has " + question_count + " questions.";
		
		return desc;
	}
	
	public String getCreator()
	{
		return this.creator;
	}
	
	public String getTopic()
	{
		return this.topic;
	}
	
	public void setCreator(String creator)
	{
		this.creator = creator;
	}
}









