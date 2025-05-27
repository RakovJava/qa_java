package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParamsTests {

    private static boolean hasMane;
    private static String sex;

    public LionParamsTests(String sex, boolean hasMane) {
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] dataParams() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeDefault() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actualResult);
    }
}
