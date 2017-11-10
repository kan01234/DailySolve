package com.dotterbear.codefight.strstr;

import java.util.ArrayList;
import java.util.List;

public class Strstr {
	
	int strstr(String s, String x) {
	    List<Integer> z = new ArrayList<Integer>();
	    int count = 0, left = 0, right = -1;
	    for(int i = 0; i < s.length() - x.length() + 1; i++) {
	        if(i > right || right - left >= z.size()) {
	            for(int j = 0; j < x.length(); j++) {
	                if(i + j < s.length() && s.charAt(i + j) == x.charAt(j))
	                    count++;
	                else
	                    break;
	            }
	            if(count >= x.length()) return i;
	            left = i;
	            right = i + count;
	            z.add(count);
	            count = 0;
	        } else {
	            z.add(z.get(right - left));
	            right--;
	            continue;
	        }
	    }
	    return -1;
	}

}
