import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToRomanTest {

    @Test
    public void shouldConvert1ToI(){
        assertEquals("I", new ConvertToRoman().convertIntToRoman(1));
    }

    @Test
    public void shouldConvert1ToII(){
        assertEquals("II", new ConvertToRoman().convertIntToRoman(2));
    }

}
