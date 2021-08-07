//https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=profile

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String element = "";
        
        String reverse = "";
        
        for(int i = 0; i < A.length(); i++){
            
            char ch = A.charAt(A.length()-1-i);
            
            element = Character.toString(ch);
            
            reverse = reverse + element;
            
        }
        
        if (A.equals(reverse)){
            
            System.out.println("Yes");
            
        }else{
            System.out.println("No");
            
        }
        
    }
}



