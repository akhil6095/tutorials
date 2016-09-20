package com.baeldung.java9;


import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetExamplesTest {

    @Test
    public void testUnmutableSet(){
        Set<String> strKeySet = Set.of("key1", "key2", "key3");
        try{
            strKeySet.add("newKey");
        }catch(UnsupportedOperationException uoe){          
        }
        assertEquals(strKeySet.size(), 3); 
    }
    
    @Test
    public void testArrayToSet(){
        Integer [] intArray = new Integer[]{1,2,3,4,5,6,7,8,9,0};
        Set<Integer> intSet = Set.of(intArray);
        assertEquals(intSet.size(), intArray.length);
    }
}
