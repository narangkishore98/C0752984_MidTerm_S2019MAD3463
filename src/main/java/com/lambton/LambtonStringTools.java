package com.lambton;

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
        int startindex;
        int endindex;
        string = string.toLowerCase();
        pattern = pattern.toLowerCase();
        startindex = string.indexOf(pattern);
        if(startindex==-1)
        {
            return string;
        }
        String beforeString = string.substring(0,startindex);
        resultString += string.substring(0,startindex);
        resultString+=replaceString;
        resultString+= string.substring(beforeString.length()+startindex+1);
        return resultString;
    }

}
