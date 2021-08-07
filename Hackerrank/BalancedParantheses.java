package Experiments;

import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        String[] strings = new String[testCases+1];
            String element = in.nextLine();
        for(int j = 0; j < testCases;j++){
            strings[j] = element;
        }

        for (String expression : strings) {

            Stack<Character> skobki = new Stack<>();
            for (int i = 0; i < expression.length(); i++) {

                if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{') {

                    skobki.push(expression.charAt(i));

                }

                if (expression.charAt(i) == ')' || expression.charAt(i) == ']' || expression.charAt(i) == '}') {

                    if (skobki.empty()) {
                        System.out.println("Invalid");
                        break;
                    } else {
                        if ((skobki.peek() == '(' && expression.charAt(i) == ')') ||
                                (skobki.peek() == '[' && expression.charAt(i) == ']') ||
                                (skobki.peek() == '{' && expression.charAt(i) == '}')) {
                            skobki.pop();
                        } else {
                            System.out.println("Invalid");
                            break;
                        }
                    }

                }


            }

            if (skobki.empty()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }
}
