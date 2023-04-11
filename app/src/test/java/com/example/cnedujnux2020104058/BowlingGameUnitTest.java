package com.example.cnedujnux2020104058;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test10ones()
    {
        repeatedRoll(10, 1);
        assertEquals(10, game.score());
    }
    @Test
    public void test10twos()
    {
        repeatedRoll(20,2);
        assertEquals(40,game.score());
    }

    @Test
    /*public void testASpare()
    {
        game.roll(3);
        game.roll(7);//扔了一个补中
        game.roll(5);
        repeatedRoll(17, 0);
        assertEquals(10, game.score());
    }*/

    private void repeatedRoll(int times, int pin) {//返回
        for(int i=0;i<times;i++){
            game.roll(pin);
        }
    }
}