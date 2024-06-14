package com.entertainment;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//You need to check Volume -1, 0 and 101//
public class TelevisionTest {
    private Television tv;

    @Before
    public void setUp() {
        tv = new Television();
    }

    @Test
    public void changeChanel_shouldStoreValue_validInput_lowerBound()
    throws InvalidChannelException{
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test (expected=InvalidChannelException.class)    //Use this one if you want to punt the error
    public void chaneChannel_shouldThrowInvalidChannelException_invalidInput_lowerBound()
    throws InvalidChannelException{
        tv.changeChannel(0);
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_upperBound() {
        //101
    }


    @Test     // use this when you don't need to throw an exception and have a valid input
    public void setVolume_shouldStoreValueInput_lowerBound() {
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_validInput_upperBound() {
        tv.setVolume(100);
        assertEquals(100,tv.getVolume());
    }
}