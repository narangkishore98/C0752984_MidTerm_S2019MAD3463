package com.lambton;

import java.util.HashMap;
import java.util.Map;

public class LambtonStringTools
{
    public String reverse(String string)
    {
        StringBuilder rev= new StringBuilder(); //String s = "";

        for(int i=string.length()-1;i>=0;i--)
        {
            rev.append(string.charAt(i));
        }
        return rev.toString();
    }
    public int  binaryToDecimal(String binary)
    {
        int decimal = 0;
        int binaryMultiplier = 1;
        for(char c:reverse(binary).toCharArray())
        {
            if(c=='1')
            {
                decimal+=binaryMultiplier;

            }

            binaryMultiplier*=2;
        }
        return decimal;
    }
    public String initials(String fullName)
    {
        String names[] = fullName.split(" ");
        if(names.length == 2)
        {
            return null;
        }
        else
        {
            String initials = "";
            for(int i=0;i<names.length-1;i++)
            {
                initials+=names[i].toUpperCase().charAt(0)+". ";
            }
            initials+=titleCase(names[names.length-1]);
            return initials;

        }
    }
    public String titleCase(String name)
    {
        name = name.toLowerCase();
        String titleCasedName = "";
        titleCasedName+=Character.toString(name.charAt(0)).toUpperCase();
        titleCasedName+=name.substring(1);
        return titleCasedName;
    }
    public String replaceSubString(String string, String pattern, String replaceString)
    {
        String resultString="";
        string = string.toLowerCase();
        pattern = pattern.toLowerCase();
        replaceString = replaceString.toLowerCase();
        int startIndex,endIndex;
        String beforeString, afterString;
        while(string.indexOf(pattern)!=-1)
        {
            resultString = "";
            startIndex = string.indexOf(pattern);
            endIndex = startIndex+pattern.length();
            beforeString = string.substring(startIndex);
            afterString = string.substring(endIndex);
            resultString = beforeString+replaceString+afterString;


        }
        return resultString;
    }






    public char mostFrequent(String string)
    {
        char ch = '\0';
        Map<Character, Integer> map;
        map = new HashMap<Character, Integer>();

        for(char c:string.toCharArray())
        {
            if(map.get(c)==null)
            {
                map.put(c,1);
            }
            else
            {
                map.put(c, map.get(c)+1);
            }

        }
        int max = -1;
        for(int i=0;i<string.length();i++)
        {
            if(map.get(string.charAt(i))>max)
            {
                max=i;
            }
        }
        if(max==1)
        {
            ch = string.charAt(string.length()-1);
        }
        else
        {
            ch = (string.charAt(max));
        }
        return ch;
    }


}
