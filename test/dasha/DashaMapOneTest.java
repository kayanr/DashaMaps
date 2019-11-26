package dasha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashaMapOneTest {
    DashaMapOne dash;

    @Before
    public void init() {
        dash = new DashaMapOne();
        dash.set("yup", 1);
        dash.set("cool", 2);
        dash.set("bye girl", 4);
        dash.set("Ryan", 42);
        dash.set("Kai", 13);
        dash.set("Kendra", 3);
        dash.set("Wes", 420);
        dash.set("yoda", 16);


    }

    @Test
    public void setTest() {
        Assert.assertEquals(42 , dash.get("Ryan").intValue());
        Assert.assertEquals(13 , dash.get("Kai").intValue());
        Assert.assertEquals(3 , dash.get("Kendra").intValue());
        Assert.assertEquals(420 , dash.get("Wes").intValue());


    }

    @Test
    public void deleteTest() {
        dash.delete("yup");


    }

    @Test
    public void getTest() {
        Integer expected = 2;
        Integer actual = dash.get("cool");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isEmptyTest() {
    }

    @Test
    public void sizeTest() {
        Assert.assertEquals(8, dash.size());
    }

    @Test
    public void bucketSizeTest() {
        Assert.assertEquals(2, dash.bucketSize("yup"));
    }
}