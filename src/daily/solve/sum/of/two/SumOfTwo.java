package daily.solve.sum.of.two;

public class SumOfTwo {
	boolean sumOfTwo(int[] a, int[] b, int v) {
	    for(int i : a) {
	        for(int j : b) {           
	            if(i + j == v) return true;
	        }
	    }
	    return false;
	}
}

