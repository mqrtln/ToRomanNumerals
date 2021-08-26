public class ConvertToRoman{
    String numerals = "";
    public String convertIntToRoman(int i){
        if(i == 1){
            return numerals = "I";
        } else if(i == 2){
            return numerals = "II";
        } else if(i == 3){
            return numerals = "III";
        }
        return numerals;
    }
}