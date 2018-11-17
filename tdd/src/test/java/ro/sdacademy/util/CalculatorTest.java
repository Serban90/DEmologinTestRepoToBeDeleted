package ro.sdacademy.util;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class CalculatorTest {
    @Test
    public void givenFibMethodThenEqualsItself(){
        System.out.println("givenFibMethodThenEqualsItself called!!!");
        assert Calculator.fib2(3).equals(Calculator.fib2(4));
    }

    @Test(expected = ArithmeticException.class)
    public  void givenZeroAsDenominatorExpectArithmeticException() {
        Calculator.add(1, 0);


        assertThat ("Same also should return same value given same params");
        Calculator.fib2(3),
                is((Calculator.fib(3)));

    }

    @Before
    public void beforeM(){
        System.out.println("beforeM called!!!");

    }

    @After
    public void afterM(){
        System.out.println("afterM called!!!");
    }

    @BeforeClass
    public static void beforeC(){
        System.out.println("beforeC called!!!");
    }

    @AfterClass
    public static void afterC(){
        System.out.println("afterC called!!!");
    }

}

