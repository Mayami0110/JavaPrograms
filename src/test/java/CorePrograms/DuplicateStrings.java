package CorePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DuplicateStrings {

	public static void main(String[] args) {
		
		
		// Duplicate words in String or Array 
		
		String statement = "Hey java java c bed java test selenium qtp test selenium";
		
		String[] str = statement.split(" ");	
	
	/*	//1. Hash Set
		
		Set<String> hs = new HashSet<String>();
		
		for(String st : str)
		{
			if(hs.add(st) == false)
			{
				System.out.println(st);
			}
			
		}
		*/
		
		//use map 
		
		Map<String, Integer> mp1 = new HashMap<String, Integer>();
		
		for(String st : str)
		{
			Integer count =mp1.get(st);
			if(count == null)
			{
				mp1.put(st, 1);
				
			}
			else
			{
				mp1.put(st,++count);
			}
		}
		
		Set<String> setvalue = mp1.keySet();
		
		for(String dupkey : setvalue)
		{
			if(mp1.get(dupkey)>1)
			{
				System.out.println(dupkey + "  : " + mp1.get(dupkey));
			}
		}
		
		
		
		
	/*	// Use Map
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for(String st : str) {
			
			if(mp.containsKey(st)) {
				
				mp.put(st, mp.get(st)+1);
				
			}
			else{
				mp.put(st, 1);
			}
			
			
		}
		
		//extracting all values
		
		Set<String> DupSet = mp.keySet();
		for(String dp : DupSet)
		{
		if(mp.get(dp)>1)	
			System.out.println(dp +":   " + mp.get(dp));
			
		}
		
*/		
		
		
		
	}

}
