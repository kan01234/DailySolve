package com.dotterbear.codefight.sum.of.two;

public class SumOfTwo {

	public boolean test(int[] a, int[] b, int v) {
	    for(int i : a) {
	        for(int j : b) {           
	            if(i + j == v) return true;
	        }
	    }
	    return false;
	}

}

