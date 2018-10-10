import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacciTestFor0(){
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void fibonacciTestFor1(){
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void fibonacciTest(){
        assertEquals(8, Fibonacci.fibonacci(6));
    }


    @Test
    public void fibonacciTestString(){
        assertEquals(0, Fibonacci.fibonacci(-1));
    }
}