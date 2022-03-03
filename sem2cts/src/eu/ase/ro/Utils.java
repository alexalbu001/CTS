package eu.ase.ro;

public class Utils {
	public int findMinInsideUnsortedArray(int [] v) throws Exception {
		if(v==null || v.length==0 ) {
			throw new Exception("Vector is null");
		}
		int min=v[0];
		/*
		 * for(int i=1;i<v.length-1;i=i+2) { if(min>v[i]) { min=v[i]; } } for(int
		 * i=2;i<v.length;i=i+2) { if(min>v[i]) { min=v[i]; }
		 * 
		 * }
		 */
		for(int i=0; i<v.length; i++) {
			if(min>v[i])
				min = v[i];
		}
				
		return min;
	}
}
