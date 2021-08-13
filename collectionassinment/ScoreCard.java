package com.techment.collectionassinment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScoreCard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> scorecard = new HashMap<String, Integer>();
		int high = 0;
		String name= null;
		
		System.out.println("Enter the Number of total Players");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter players"+(i+1)+" name ");
			String s= sc.next();
			System.out.println("Enter the RUN SCORED by player ");
			int c= sc.nextInt();
			scorecard.put(s,c);
		}
		
		
		int total = 0;
		System.out.println("==============List of players who batted===========");
		for(String string : scorecard.keySet())
		{
			System.out.println(string);
			
		}
		
		System.out.println("====================SCORES made by players=============");
		
		for(Entry<String, Integer> e : scorecard.entrySet())
		{
		
		
		System.out.println(e.getKey()+" : "+e.getValue());
        total = total+e.getValue();
        
        if(high<e.getValue())
        {
        	high = e.getValue();
        	name = e.getKey();
        }
		}
        
        System.out.println("============Details===========");
        
        System.out.println("Total Score = "+total);
        System.out.println("Highest score is = "+high);
        System.out.println("heighest score scored by the player "+name);

	}

}
