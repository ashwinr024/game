
public class destination {
private String name;
private String health;
private String alignment;
destination(String name,String health,String alignment)
{
	this.name=name;
	this.health=health;
	this.alignment=alignment;
}
public void setname(String name)
{
	this.name=name;
}
public void sethealth(String health)
{
	this.health=health;
}
public void setalignment(String alignment)
{
	this.alignment=alignment;
}
public String getname()
{
	return name;
}
public String gethealth()
{
	return health;
}
public String getalignment()
{
	return alignment;
}

}
