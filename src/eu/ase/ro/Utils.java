package eu.ase.ro;

public class Utils {
	
	
	
	static int functionCount(int v[], int i)
	{
		int k=0;
		int min=v[0];
		
		for (i=0;i<v.length;i++) {
			if(min==v[i])
			{
				k=k+1;
			}
			else
			
				if(min>v[i])
				{
					min=v[i];
					k=1;
				}
			}
		
		return k;
	}
		
}