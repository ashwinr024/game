
public class map {
	private int xs;
	private int ys;
	private int cx;
	private int cy;
	private int winx;
	private int winy;
	map(int xs,int ys)
	{
		this.xs=xs;
		this.ys=ys;
	}
	public void setcx()
	{
		cx=1;
	}
	public void setcy()
	{
		cy=1;
	}
	public int getcx()
	{
		return cx;
	}
	public int getcy()
	{
		return cy;
	}
	public void setwinx(int winx)
	{
		this.winx=winx;
	}
	public void setwiny(int winy)
	{
		this.winy=winy;
	}
	public int getwinx()
	{
		return winx;
	}
	public int getwiny()
	{
		return winy;
	}
	
	public int move(String d)
	{
			if((cx!=winx || cy!=winy))
			{
				if(d.equals("N") || d.equals("n"))
				{
					if(cy==1)
					{
						cy=xs;
					}
					else
					{
						cy--;
					}
				}
				else if(d.equals("S") || d.equals("s"))
				{
					if(cy==ys)
					{
						cy=1;
					}
					else
					{
						cy++;
					}
				}
				else if(d.equals("W") || d.equals("w"))
				{
					if(cx==1)
					{
						cx=xs;
					}
					else
					{
						cx--;
					}
				}
				else if(d.equals("E") || d.equals("e"))
				{
					if(cx==xs)
					{
						cx=1;
					}
					else
					{
						cx++;
					}
				}
				
			}
			if((cx==winx && cy==winy))
			{
				
					System.out.println("You won!");
					return 1;
				
			}
			return 0;
		}
	}
	
	

