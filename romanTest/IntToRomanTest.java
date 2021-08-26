import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToRomanTest {

    @Test
    public void shouldConvert1ToI(){
        assertEquals("I", new ConvertToRoman().convertIntToRoman(1));
    }

    @Test
    public void shouldConvert2ToII(){
        assertEquals("II", new ConvertToRoman().convertIntToRoman(2));
    }
    @Test
    public void shouldConvert3ToIII(){
        assertEquals("III", new ConvertToRoman().convertIntToRoman(3));
    }
}
