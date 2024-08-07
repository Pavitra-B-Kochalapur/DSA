package com.pavitrabk.strings;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		HashMap<Character, Integer> hm1 = new HashMap<>();
		
		for(int i=0; i<s1.length(); i++)
		{
			if(hm1.containsKey(s1.charAt(i)))
			{
				hm1.put(s1.charAt(i), hm1.get(s1.charAt(i))+1);
			}else {
				hm1.put(s1.charAt(i), 1);
			}
		}
		
        HashMap<Character, Integer> hm2 = new HashMap<>();
		
		for(int i=0; i<s2.length(); i++)
		{
			if(hm2.containsKey(s2.charAt(i)))
			{
				hm2.put(s2.charAt(i), hm2.get(s2.charAt(i))+1);
			}else {
				hm2.put(s2.charAt(i), 1);
			}
		}
		
		if(hm1.equals(hm2))
		{
			System.out.println("Anagrams");
		}else {
			System.out.println("not Anagrams");
		}
		

	}

}
