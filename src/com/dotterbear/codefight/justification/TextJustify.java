package com.dotterbear.codefight.justification;

import java.util.ArrayList;
import java.util.List;

public class TextJustify {

	public String[] justify(String[] words, int maxLength) {
		if(words == null || words.length < 1 || maxLength <= 0) return null;
		List<String> list = new ArrayList<String>();
		int pointer = 0, start = 0, end = -1, currentLength = 0;
		while (pointer < words.length) {
			if ((currentLength + words[pointer].length() + (end - start + 1)) <= maxLength) {
				currentLength += words[pointer].length();
				end = pointer;
				pointer++;
			} else {
				list.add(wordsToLine(words, start, end, currentLength, maxLength, false));
				start = pointer;
				end = start - 1;
				currentLength = 0;
			}
		}
		list.add(wordsToLine(words, start, end, currentLength, maxLength, true));
		return list.toArray(new String[list.size()]);
	}

	String wordsToLine(String[] words, int start, int end, int currentLength, int maxLength, boolean isLast) {
		String str = words[start];
		int count = end - start + 1;
		if (count == 1 || isLast) {
			for (int i = start + 1; i <= end; i++) {
				str = append(str, " ", 1);
				str += words[i];
			}
			return append(str, " ", (maxLength - currentLength - count + 1));
		} else {
			int space = (maxLength - currentLength) / (count - 1), group = (maxLength - currentLength) % (count - 1);
			for (int i = start + 1; i <= end; i++) {
				str = append(str, " ", (i - start) <= group ? space + 1 : space);
				str += words[i];
			}
		}
		return str;
	}

	String append(String originalStr, String newStr, int times) {
		for (int i = 0; i < times; i++)
			originalStr += newStr;
		return originalStr;
	}

}
