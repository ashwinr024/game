
public class character {
	private String name;
	private String des;
	private String scar;
	character(String name,String des,String scar)
	{
		this.name=name;
		this.des=des;
		this.scar=scar;
	}
	character(String name,String des)
	{
		this.name=name;
		this.des=des;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		 this.name=name;
	}
	
	

}
