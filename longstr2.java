package com.src.algrithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longstr {

	 public static int lengthOfLongestSubstring(String s) {  
	        Map<Character,Integer> map=new HashMap<Character,Integer>();  
	        int maxLength=0;  
	        int now=0;  
	        for(int i=0;i<s.length();i++){  
	            //System.out.println(now);  
	            //System.out.println(map);  
	            if(map.containsKey(s.charAt(i))){  
	                //System.out.println("now:"+now);  
	                now=Math.max(map.get(s.charAt(i))+1,now);  
	                if((i-now+1)>maxLength){  
	                    maxLength=i-now+1;  
	                      
	                }  
	            }else{  
	                if((i-now+1)>maxLength){  
	                    maxLength=i-now+1;  
	                }  
	            }  
	            map.put(s.charAt(i), i);  
	        }  
	        return maxLength;  
	    }  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	    //	String str=null;
	        if(str == null || str == "")
	        	System.out.println(0);
	        System.out.println(lengthOfLongestSubstring(str));  
	    }  

}
