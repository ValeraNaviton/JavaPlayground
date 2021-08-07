//https://www.hackerrank.com/challenges/java-primality-test/problem?h_r=profile

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
public static void main(String[] args){
       
       Scanner scanner = new Scanner(System.in);
       
       BigInteger output = scanner.nextBigInteger();
       
       if(output.isProbablePrime(1)){
           System.out.println("prime");
       }else{
           System.out.println("not prime");
       }
    }
}
