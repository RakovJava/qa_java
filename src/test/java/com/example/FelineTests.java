package com.example;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;


public class FelineTests {

    @Test
    public void getKittensDefault() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithArgument() {
        Feline feline = new Feline();
        int expectedResult = 3;
        int actualResult = feline.getKittens(3);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyDefault() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eatMeatDefault() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
