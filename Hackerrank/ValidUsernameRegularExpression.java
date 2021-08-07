import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/valid-username-checker/problem
public class Solution {

    public boolean validation(String login){
        
        String regex = "^[a-zA-Z]\\w{7,29}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(login);
        
        boolean output = matcher.matches();
        
        return output;
        
    }

    public static void main(String[] args) {
        
        Solution solution = new Solution();
        
        Scanner input = new Scanner(System.in);
        
        int n = Integer.parseInt(input.nextLine());
        while (n-- != 0) {
            String userName = input.nextLine();
            
            if(solution.validation(userName)){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}
