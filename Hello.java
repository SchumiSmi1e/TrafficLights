package my;

public class Hello
{


	public static void main(String[] args)
	{
		Signal tl = new Signal();
		
		tl.status = 2;
		tl.show();
		
		tl.next();
		tl.next();
		tl.next();
	}

}
