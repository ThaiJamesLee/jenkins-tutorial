package de.test.jenkins.tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassToBeTestedTest {

    private ClassToBeTested underTest = new ClassToBeTested();

    @Test
    public void addOneTest() {
        Assert.assertEquals(underTest.plusOne(2), 3);
    }
}
