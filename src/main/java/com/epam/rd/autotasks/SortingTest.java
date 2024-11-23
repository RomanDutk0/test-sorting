package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.Assert;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase(){
        int[] array = new int[]{};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = new int[]{2};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{2}, array);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array = new int[]{1,2,3,4,5,6};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = new int[]{2,1,3,0,-1};
        sorting.sort(array);
        int[] expected = new int[]{-1,0,1,2,3};
        Assert.assertArrayEquals(expected,array);
    }

}