package com.katas.minesweeper;

import org.junit.Test;

import static com.sgcib.katas.minesweeper.MinesweeperTest.checkResult;


/**
 * @author Chloé Mahalin
 */
public class MinesweeperAcceptanceTest {

    @Test
    public void test_no_mine() {
        Minesweeper game = new Minesweeper();
        String result = game.process(Area.generate(
                "...",
                "...",
                "..."
        ));

        String expected =
                "000\n" +
                "000\n" +
                "000";

        checkResult(expected,result.toString());
    }

    @Test
    public void test_one_mine() {
        Minesweeper game = new Minesweeper();
        String result = game.process(Area.generate(
                "*..",
                "...",
                "..."
        ));

        String expected =
                "*10\n" +
                "110\n" +
                "000";

        checkResult(expected,result);
    }


    @Test
    public void test_two_mines() {
        Minesweeper game = new Minesweeper();
        String result = game.process(Area.generate(
                "*.*",
                "...",
                "..."
        ));

        String expected =
                "*2*\n" +
                "121\n" +
                "000";

        checkResult(expected,result);
    }
}
