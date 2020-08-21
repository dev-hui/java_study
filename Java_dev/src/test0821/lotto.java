package test0821;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
    	Scanner sc = new Scanner(System.in);

        //System.setIn(new FileInputStream("C:\\sample_input.txt"));
    	int[] lotto = {7, 37, 38, 39, 40, 44};
    	int bonus = 18;
    	
    	System.out.println("enter case Number > ");
    	int caseNum = sc.nextInt();
    	
    	for(int c=0; c<caseNum; c++) {
        	System.out.println("enter test Number > ");
        	int testNum = sc.nextInt();
        	for(int t=0; t<testNum; t++) {
		      	int[] myNum = new int[6];
		    	Random random = new Random();
		    	for(int i=0; i<6; i++) {
		    		myNum[i] = random.nextInt(45)+1;
		    		
		    		for(int j=0; j<i; j++) {
		    			if(myNum[i]==myNum[j]) {
		    				i--;
		    			}
		    		}
		    	}
		    	for(int i=0; i<myNum.length; i++) {
		    		System.out.print(myNum[i]+" ");
		    	}
		    	System.out.println();  	
        	} 
    	} System.out.println(); 
    
    Arrays.sort(lotto);
    
    	
    }
}
