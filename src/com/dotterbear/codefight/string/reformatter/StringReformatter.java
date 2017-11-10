package com.dotterbear.codefight.string.reformatter;

public class StringReformatter {

	String stringReformatting(String s, int k) {
	    s = new StringBuffer(s.replace("-", "")).reverse().toString();
	    String s2 = "";
	    for(int i = 0; i < s.length(); i ++) {
	        s2 += s.charAt(i);
	        if((i + 1) % k == 0 && (i + 1) != s.length()) s2 += "-";
	    }
	    return new StringBuffer(s2).reverse().toString();
	}

}
