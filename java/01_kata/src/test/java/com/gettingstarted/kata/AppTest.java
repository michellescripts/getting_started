package com.gettingstarted.kata;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private App katas;

    @Before
    public void initApp() {
        katas = new App();
    }

    @Test
    public void intToStr_returnsNumAsString() {
        assert(katas.intToString(3)).equals("3");
        assert(katas.intToString(0)).equals("0");
        assert(katas.intToString(-3)).equals("-3");
    }

    @Test
    public void boolToAnswer_returnsYesOrNo() {
        assert(katas.boolToAnswer(true)).equals("Yes");
        assert(katas.boolToAnswer(false)).equals("No");
    }

    @Test
    public void lowAndHigh_returnsLowestAndHighest() {
        assert(katas.lowAndHigh("1 0 9 -4").equals("-4 9"));
        assert(katas.lowAndHigh("-99 1 99 100").equals("-99 100"));
        assert(katas.lowAndHigh("1 293").equals("1 293"));
        assert(katas.lowAndHigh("2147483647 -2147483648").equals("-2147483648 2147483647"));
    }

    @Test
    public void aScrambleScore_returnsHighestScoringWord() {
        assert(katas.aScrambleScore("a, ab, abc")).equals("abc, 6");
        assert(katas.aScrambleScore("c, aaaa")).equals("aaaa, 4");
        assert(katas.aScrambleScore("fox, box")).equals("fox, 45");
    }
}
