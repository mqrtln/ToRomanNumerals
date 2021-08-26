import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToRomanTest {

    @Test
    public void shouldConvert1ToI(){
        assertEquals("I", new ConvertToRoman().convert1toI(1));
    }



}
