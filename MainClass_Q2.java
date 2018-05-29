/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author ercan
 */
public class MainClass_Q2 {
    
    static int N = 15;
	
	// Function for finding maximum sum
	static int maxPathSum(int pyramid[][], int m, int n)
	{
		// loop for bottom-up calculation
		for (int i = m - 1; i >= 0; i--)
		{
			for (int j = 0; j <= i; j++)
			{
				// for each element, check both
				// elements just below the number
				// and below right to the number
				// add the maximum of them to it
				if (pyramid[i + 1][j] > pyramid[i + 1][j + 1]){
					pyramid[i][j] += pyramid[i + 1][j];
                                        //System.out.println(" "+pyramid[i + 1][j]);
                                }else{
					pyramid[i][j] += pyramid[i + 1][j + 1];
                                        //System.out.println(" "+pyramid[i + 1][j+1]);
                                }
			}
		}
	
		// return the top element
		// which stores the maximum sum
		return pyramid[0][0];
	}
	static void setPrimesToZero(int pyramid[][])
	{
	    for(int i = 0; i<N; ++i){
	        for(int j = 0; j<N; ++j){
	            if(isPrime(pyramid[i][j])) // if true is prime number and set to zero
	                pyramid[i][j] = 0;
	        }
	    }
	}
	static boolean isPrime(int n)
	{
	    if(n == 1 || n == 2)
            return false;
        
        for (int i=2; i<=n/2; i++ )
        {
            if(n%i==0)
                return false;
        }
            
        return true;
	}
	/* Driver program to test above functions */
	public static void main (String[] args)
	{
		int pyramid[][] = { {215,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {193,124,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {117,237,442,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {218,935,347,235,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {320,804,522,417,345,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {229,601,723,835,133,124,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {248,202,277,433,207,263,257,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {359,464,504,528,516,716,871,182,0  ,0  ,0  ,0  ,0  ,0  ,0 },
                                {461,441,426,656,863,560,380,171,923,0  ,0  ,0  ,0  ,0  ,0 },
                                {381,348,573,533,447,632,387,176,975,449,0  ,0  ,0  ,0  ,0 },
                                {223,711,445,645,245,543,931,532,937,541,444,0  ,0  ,0  ,0 },
                                {330,131,333,928,377,733,017,778,839,168,197,197,0  ,0  ,0 },
                                {131,171,522,137,217,224,291,413,528,520,227,229,928,0  ,0 },
                                {223,626,034,683,839,53,627,310,713,999,629,817,410,121,0 },
                                {924,622,911,233,325,139,721,218,253,223,107,233,230,124,233 }};
                
		setPrimesToZero(pyramid);
                /*for(int i = 0; i<N; ++i){
                    for(int j = 0; j<N; ++j){
                        System.out.print(pyramid[i][j] + " ");
                    }
                    System.out.println("");
                }*/
		System.out.println ( maxPathSum(pyramid, 14,14));
	}
    
}




