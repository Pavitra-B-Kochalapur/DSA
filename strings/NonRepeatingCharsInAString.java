package com.pavitrabk.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NonRepeatingCharsInAString {

	public static void main(String[] args) {
		String str = "take you forward";
		char[] ch = str.toCharArray();
//		HashSet<Character> hs = new HashSet<>();
//		for(int i=0; i<str.length(); i++)
//		{
//			hs.add(ch[i]);
//		}
//		System.out.println(hs);
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else {
				hm.put(str.charAt(i),1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet())
		{
			if(entry.getValue() == 1)
			{
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		
		
	}

}
