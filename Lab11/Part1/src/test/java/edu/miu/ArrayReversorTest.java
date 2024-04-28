package edu.miu;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(value = MockitoJUnitRunner.class)
public class ArrayReversorTest {
    @Mock
    ArrayFlattenerService arrayFlattenService;

    @Test
    public void testItReturnReversedArray() {
        int[][] arr = new int[][]{{3, 2, 1}, {4, 1, 2}};
        var reversor = new ArrayReversor(arrayFlattenService);
        when(arrayFlattenService.flatten(arr)).thenReturn(new int[] {3, 2, 1, 4, 1, 2});
        var expected = new int[] {2, 1, 4, 1, 2, 3};
        var result = reversor.reverse(arr);
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void testReturnNullIfInputIsNull() {
        var arrayReversor = new ArrayReversor(arrayFlattenService);
        var result = arrayReversor.reverse(null);
        Assert.assertArrayEquals(result, null);
    }
}
