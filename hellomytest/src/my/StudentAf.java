package my;

public class StudentAf
{
	private String id;
	private String name;
	
	public StudentAf()
	{
		
	}
	
	public StudentAf(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return String.format("(%s, %s)", name, id);
	}
	
	
	
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	
}