import no.kristiania.pgr301.convertIntToRoman.ConvertToRoman;
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

    @Test
    public void shouldConvert4toIV() { assertEquals("IV", new ConvertToRoman().convertIntToRoman(4));}

    @Test
    public void shouldConvert5toV() { assertEquals("V", new ConvertToRoman().convertIntToRoman(5));}

    @Test
    public void shouldConvert5toVI() { assertEquals("VI", new ConvertToRoman().convertIntToRoman(6));}


    @Test
    public void shouldConvert8toVIII() { assertEquals("VIII", new ConvertToRoman().convertIntToRoman(8));}


    @Test
    public void shouldConvert9toIX() { assertEquals("IX", new ConvertToRoman().convertIntToRoman(9));}


    @Test
    public void shouldConvert10toX() { assertEquals("X", new ConvertToRoman().convertIntToRoman(10));}

    @Test
    public void shouldConvert20toXX() { assertEquals("XX", new ConvertToRoman().convertIntToRoman(20));}

    @Test
    public void shouldConvert13toXIII() { assertEquals("XIII", new ConvertToRoman().convertIntToRoman(13));}

    @Test
    public void shouldConvert18toXVIII() {assertEquals("XVIII", new ConvertToRoman().convertIntToRoman(18));}

    @Test
    public void shouldConvert32toXIII() {assertEquals("XXXII", new ConvertToRoman().convertIntToRoman(32));}

    @Test
    public void shouldConvert37toXXXVII() {assertEquals("XXXVII", new ConvertToRoman().convertIntToRoman(37));}

    @Test
    public void shouldConvert51toLI() {assertEquals("LI", new ConvertToRoman().convertIntToRoman(51));}

}
