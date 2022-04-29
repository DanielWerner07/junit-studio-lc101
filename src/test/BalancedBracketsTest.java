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
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void nothingGiven() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wrongBracketSecond() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launchCode]]["));
    }

    @Test
    public void stringInBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketBeforeString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void oneOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void reverseBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("launch]code["));
    }

    @Test
    public void oneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneGoodSetandOneBadSet() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launch[code]["));
    }

}
