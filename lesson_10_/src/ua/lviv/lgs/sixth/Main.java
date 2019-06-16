package ua.lviv.lgs.sixth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class Main { 
  
    public static void main(String[] args) {   
            
            String text = "In today’s world, reading is basic to everyday life. As children we learn to read, and as adults, we read to learn. We read to learn about the news, to learn about rules, and to learn about how to do things. We also use reading to learn English.";
             
            String[] words = text.split(" ");
    		int count = 1;
    		int max = 0;
    		String mostRepeatableWord = null;

    		for (int i = 0; i < words.length; i++) {
    			for (int j = i + 1; j < words.length; j++) {
    				if (words[i].equals(words[j])) {
    					count = count + 1;
    					if (count > max) {
    						max = count;
    						mostRepeatableWord = words[i];
    					}
    					words[j] = "0";
    				}
    			}
    			if (words[i] != "0") {

    				count = 1;
    			}
    		}
    		
    		System.out.println(Arrays.toString(words));
    		System.out.println("В тексті найчастіше використовується слово " + mostRepeatableWord + ". Воно зустрічається "
    				+ max + " рази");
        } 
        
   
    }
