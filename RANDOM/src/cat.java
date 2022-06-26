
public  class cat extends mammal {
	String sound;
	cat(String sound)
	{
		this.sound=sound;
	}
	public String gets()
	{
		return sound;
	}
	
	public void sound()
	{
		System.out.println(this.gets());
	}
	@Override
	public void ctemp() {
		// TODO Auto-generated method stub
		System.out.println("reduce the temp");
		
	}
	public void sleep()
	{
		System.out.println("10mins");
	}

}
