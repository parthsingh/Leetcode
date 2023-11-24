/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        if(magazine.length() < ransomNote.length())
            return false;

        char[] mag = magazine.toCharArray();

        int counter = 0;

        for(int i = 0; i<ransomNote.length(); i++)
        {
            char c = ransomNote.charAt(i);

            for(int j = 0; j<mag.length; j++)
            {
                char m = mag[j];
                if(m == c)
                {
                    counter++;
                    mag[j] = '1';
                    break;
                }

            }
        }

        if(counter == ransomNote.length())
            return true;
        else
            return false;


        
    }
}
