package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    private PrimeChecker primeChecker=new PrimeChecker();
    private static int count=0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber(){
        PrimeChecker primeChecker=new PrimeChecker();
        boolean result=primeChecker.isPrime(14);
        count++;
        System.out.println("Test number "+count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber(){
        PrimeChecker primeChecker=new PrimeChecker();
        boolean result=primeChecker.isPrime(13);
        count++;
        System.out.println("Test number "+count);
        assertTrue(result);
    }
    @Test
    public void shouldReturnTrueWhenPassingTwo(){
        PrimeChecker primeChecker=new PrimeChecker();
        boolean result=primeChecker.isPrime(2);
        count++;
        System.out.println("Test number "+count);
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingOne(){
        PrimeChecker primeChecker=new PrimeChecker();
        boolean result=primeChecker.isPrime(1);
        count++;
        System.out.println("Test number "+count);
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingZero(){
        PrimeChecker primeChecker=new PrimeChecker();
        boolean result=primeChecker.isPrime(0);
        count++;
        System.out.println("Test number "+count);
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingNegative(){
        PrimeChecker primeChecker=new PrimeChecker();
        boolean result=primeChecker.isPrime(-6);
        count++;
        System.out.println("Test number "+count);
        assertFalse(result);
    }
}
