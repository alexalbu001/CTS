package eu.ase.ro;

public class classOne {
	
	public float calculate(int n, float s, int period)
	  {
	    //float result = 0;
	    float value = (period > 10) ? (float)30/100 : (float)period/100; 
	    if (n == 1)
	    {
	    	//result = s;
	    	return s;
	    }
	    else if (n == 2)
	    {
	    	return (s - (0.1f * s)) - value * (s - (0.1f * s));
	    }
	    else if (n == 3)
	    {
	    	return (s - (0.25f * s)) - value * (s - (0.25f * s));
	    }
	    else if (n == 4)
	    {
	    	return (s - (0.35f * s)) - value * (s - (0.35f * s));
	    }
	    return 0;
	  }

}

