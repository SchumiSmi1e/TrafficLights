package my;

public class Signal
{
	public int status = 0; // 0绿 1黄 2红
	
	public void show()
	{
		if(this.status == 0)
		{
			System.out.println("绿色");
		}
		else if(this.status == 1)
		{
			System.out.println("黄色");
		}
		else if(this.status == 2)
		{
			System.out.println("红色");
		}
	}
	
	public void next()
	{
		this.status += 1;
		if(this.status >= 3)
		{
			status =0;
		}
		this.show();
	}
	
}
