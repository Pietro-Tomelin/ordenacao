//método de ordenação quick sort
package Ordenacao;

import java.util.ArrayList;
import java.util.Random;
 
public class QuickSort {
	private static ArrayList<Long> inputArray = new ArrayList<Long>();
    
    public QuickSort(ArrayList<Long> inputArray){
        QuickSort.inputArray = inputArray;
    }
 
    public void startQuickStart(int start,int end){
        int q;
        if(start<end){
            q = partition(start, end);
            startQuickStart(start, q);
            startQuickStart(q+1, end);
        }
    }
 
    public ArrayList<Long> getSortedArray(){
        return QuickSort.inputArray;
    }
 
    int partition(int start,int end){
        
        int init = start;
        int length = end;
        
        Random r = new Random();
        int pivotIndex = nextIntInRange(start,end,r);
        long pivot = inputArray.get(pivotIndex);
                
        while(true){
            while(inputArray.get(length)>pivot && length>start){
                length--;
            }
            
            while(inputArray.get(init)<pivot && init<end){
                init++;
            }
            
            if(init<length){
                long temp;
                temp = inputArray.get(init);
                inputArray.set(init,inputArray.get(length));
                inputArray.set(length,temp);
                length--;
                init++;
                
            }else{
                return length;
            }
        }
        
    }

    static int nextIntInRange(int min, int max, Random rng) {
           if (min > max) {
              throw new IllegalArgumentException("Cannot draw random int from invalid range [" + min + ", " + max + "].");
           }
           int diff = max - min;
           if (diff >= 0 && diff != Integer.MAX_VALUE) {
              return (min + rng.nextInt(diff + 1));
           }
           int i;
           do {
              i = rng.nextInt();
           } while (i < min || i > max);
           return i;
        }
}