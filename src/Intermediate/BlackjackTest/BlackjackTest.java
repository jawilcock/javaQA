package Intermediate.BlackjackTest;

import Intermediate.Blackjack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackjackTest {
    @Test
    public void BlackjackTest()
    {
        assertEquals(21, Blackjack.BlackjackCalc(18,21));
    }
}
