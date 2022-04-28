package test;

import jdk.jfr.Name;
import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public  void onlyBracketsReturnsFalse() {
        assertFalse((BalancedBrackets.hasBalancedBrackets("][]")));
    }

    @Test
    public void misplacedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void nothingGiven() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void largeAmountOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][]"));
    }

    @Test
    public void test7() {

    }

    @Test
    public void test8() {

    }

    @Test
    public void test9() {

    }

    @Test
    public void test10() {

    }

    @Test
    public void test11() {

    }

    @Test
    public void test12() {

    }

}
