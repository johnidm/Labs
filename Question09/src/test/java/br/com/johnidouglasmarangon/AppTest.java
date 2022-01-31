package br.com.johnidouglasmarangon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest 
{
  
    @Test
    public void testSimilatiryEmptyString()
    {
        Integer count = StringSimilatity.calc("");
        assertEquals(0, count);
    }

    @Test
    public void testSimilatiry()
    {
        Integer[] calcs = new Integer[] { 
            StringSimilatity.calc("ababaa"),
            StringSimilatity.calc("aa"),
            StringSimilatity.calc("aacbdbaaeaa"),
            StringSimilatity.calc("eabdcbbeeedbdaebdedbcbdcdeeaebbdbedbdbccbaaeababba"),
            StringSimilatity.calc("baeeddbaeebbaeebcdedade")
         };

         Integer[] excepted = new Integer[] {
            11,
            3,
            18,
            63,
            33,
         };

         assertArrayEquals(excepted, calcs);
    }

}
