package Homework1;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 200; i++){
            BigInteger result =  Fibonacci.of(i);
            System.out.println("Fibonacci.of(" + i + ")" + "==" + result);
        }
    }
    public static BigInteger of(int num){
        if(num == 1 || num == 2){
            return new BigInteger("1");
        }

        BigInteger m = new BigInteger("1");
        BigInteger n = new BigInteger("1");

        BigInteger result = new BigInteger("0");

        for(int i = 3; i <= num; i++){
            result = m.add(n);
            m = n;
            n = result;
        }
        return result;
    }
}
