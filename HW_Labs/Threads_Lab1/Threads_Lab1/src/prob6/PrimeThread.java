package prob6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeThread extends Thread {
    int threadNumber1;
    int threadNumber2;
    List<Integer> primeList;
    
    PrimeThread(int threadnbr1, int threadnbr2) {
    	 threadNumber1 = threadnbr1;
    	 threadNumber2 = threadnbr2;
    	 primeList = new ArrayList<Integer>();
    }

    public void run() {
    	            
        //System.out.println("Prime Numbers betn: " + threadNumber1 + " & " + threadNumber2 );
        for(int i = threadNumber1; i<= threadNumber2; i++) {
        	if(isPrime(i)) {
        		primeList.add(i);
        		//System.out.println(i);
        	}	
        }      
    	
    }
    boolean  isPrime (int anInt)    {
    	// Corner case
        if (anInt <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < anInt; i++)
            if (anInt % i == 0)
                return false;
  
        return true;
    }
    
    public void printSortedPrimeList() {
    	
   	 	Collections.sort(primeList);
   	 	//System.out.println("Sorted List for " + threadNumber1 + "-" + threadNumber2);
        primeList.forEach(a -> System.out.println(a));
   }
}
