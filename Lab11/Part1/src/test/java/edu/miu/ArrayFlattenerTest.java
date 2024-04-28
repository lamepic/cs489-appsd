package edu.miu;

import org.junit.Assert;
import org.junit.Test;


public class ArrayFlattenerTest {

    private ArrayFlattener arrayFlattener;

    @Test
    public void testItReturnsValidResult() {
        var actual = new int[][] {{1, 2, 3}, {4, 5, 6}};
        arrayFlattener = new ArrayFlattener();
        var expected = new int[] {1, 2, 3, 4, 5, 6};
        var result = arrayFlattener.flatten(actual);
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void testReturnNullIfInputIsNull() {
        arrayFlattener = new ArrayFlattener();
        var result = arrayFlattener.flatten(null);
        Assert.assertArrayEquals(result, null);
    }
}
