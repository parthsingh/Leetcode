/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

 

Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
*/

class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        int sum = 0;
        ArrayList<Character> values = new ArrayList<>();

        for(int i = 0; i<chars.length(); i++)
        {
            char c = chars.charAt(i);

            values.add(c);
        }

        for(int i = 0; i<words.length; i++)
        {
            String temp = words[i];
            ArrayList<Character> holder = new ArrayList<>();
            if(temp.length() > chars.length())
                continue;
            
            int counter = 0;

            for(int j = 0; j<temp.length(); j++)
            {
                char c = temp.charAt(j);
                if(values.contains(c))
                {
                    holder.add(c);
                    values.remove(Character.valueOf(c));
                    counter++;
                }
                else
                {
                    break;
                }

                if(counter == temp.length())
                {
                    sum += counter;
                }

            }
            for(Character c : holder)
            {
                values.add(c);
            }
        }

        return sum;
        
    }
}
