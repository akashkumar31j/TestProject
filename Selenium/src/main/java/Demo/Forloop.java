package Demo;

import org.testng.annotations.Test;

public class Forloop {
	@Test
	public void forloop()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==1)
				{
				System.out.print("A");
				if(i==1||j==1||j==2)
				{
					System.out.print("A");
				}
				}
			}
		}
	}

}
