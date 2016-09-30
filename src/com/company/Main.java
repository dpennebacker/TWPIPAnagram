package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter your first single word");
        String word1 = kbInput.next();
        System.out.println("Enter your second single word");
        String word2 = kbInput.next();
        int count = 0;
        if(word1.equalsIgnoreCase(word2))
        {
            System.out.println("These words are the same!");

        }

        else if(word1.length()!=word2.length())
        {
            System.out.println(false);;
        }
        else
        {

            for(int i=0; i < word1.length(); i++)
            {
                String testChar = word1.substring(i, i + 1);

                for(int j =0; j < word2.length(); j++)
                {

                    if(testChar.equalsIgnoreCase(word2.substring(j, j+1)))
                    {
                        count++;
                        break;
                    }

                }
            }

            if(count == word1.length())
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }

        }    }
}
