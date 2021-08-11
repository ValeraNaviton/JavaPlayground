//https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for(int i = 0; i < amount;i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }
        int queryAmount = scanner.nextInt();
        
        for(int i = 0; i < queryAmount;i++){
            String command = scanner.next();
            switch (command){
                case "Insert":
                numbers.add(scanner.nextInt(), scanner.nextInt());
                break;
                
                case "Delete":
                numbers.remove(scanner.nextInt());
                
                default:
                break;
            }
        }
        
        for(Integer number: numbers){
            System.out.print(number + " ");
        }        
    }
}
