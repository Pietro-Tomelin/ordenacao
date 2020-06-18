//método de ordenação insertion sort
package Ordenacao;

import java.io.IOException;
import java.util.ArrayList;

public class InsertionSort {
	public void sort(ArrayList<Long> listaInt) throws IOException {   
		
	    for (int i = 1; i < listaInt.size(); ++i) { 
	        long key = listaInt.get(i); 
	        int j = i - 1; 
	
	        while (j >= 0 && listaInt.get(j) > key) { 
	        	listaInt.set(j + 1, listaInt.get(j)); 
	            j = j - 1; 
	        } 
	        listaInt.set(j + 1,  key); 
	    } 
	} 
	
	public static void printArray(ArrayList<Long> listaInt) { 
	    for (int i = 0; i < listaInt.size(); i++){ 
	        System.out.println(listaInt.get(i)); 
	    	}
	} 
}


