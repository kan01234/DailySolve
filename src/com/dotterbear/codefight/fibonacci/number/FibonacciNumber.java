package com.dotterbear.codefight.fibonacci.number;

import java.math.BigInteger;

public class FibonacciNumber {

	BigInteger calc(int num) {
		if(num < 2) return BigInteger.valueOf(num);
		BigInteger a = BigInteger.ONE, b = BigInteger.ONE, c;
		for(int i = 2; i < num; i++) {
			c = b;
			b = b.add(a);
			a = c;
		}
		return b;
	}

}
