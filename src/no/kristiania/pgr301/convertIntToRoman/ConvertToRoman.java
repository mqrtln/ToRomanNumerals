package no.kristiania.pgr301.convertIntToRoman;

/*public class ConvertToRoman{
    String[] numerals = {"I", "II", "III", "IV"};
    String output = "";
    public String convertIntToRoman(int numbers){
        for (int i = 0; i < numerals.length; i++){
            output = numerals[numbers-1];
        }
        return output;
    }

}*/

/*public class ConvertToRoman{
    char[] numerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    String output = "";
    public String convertIntToRoman(int numberInput){
        for (int i = 0; i < 5; i++){
            if(numberInput <= 3){
                output = String.valueOf(numerals[0] * numberInput);
            }
            else if(numberInput == 4){
                output = String.valueOf(numerals[0]) + numerals[1];
            } else if(numberInput == 5){
                output = String.valueOf(numerals[1]);
            }
        }

       return output;
    }

}*/

public class ConvertToRoman{
    public String convertIntToRoman(int numberInput) {
        char I = 'I';
        char V = 'V';
        char X = 'X';
        char L = 'L';
        char C = 'C';
        char D = 'D';
        char M = 'M';
        StringBuilder buffer = new StringBuilder();


        final String repeatI = String.valueOf(I).repeat(numberInput % 5);
        final String repeatV = String.valueOf(V).repeat(numberInput % 10 / 5);
        final String repeatX = String.valueOf(X).repeat(numberInput % 50 / 10);
        final String repeatL = String.valueOf(L).repeat(numberInput % 500 / 50);

        if (numberInput == 4) {
            buffer.append(I).append(V);
        } else if (numberInput == 9) {
            buffer.append(I).append(X);
        }else if (numberInput == 19) {
            buffer.append(X).append(I).append(X);
        }
          else{
                buffer.append(repeatL).append(repeatX).append(repeatV).append(repeatI);
            }


            return buffer.toString();
        }
    }

// designate 5 = v, 10=x, l=50, 100 = c, 500=d, 1000 = m
// break all integers into 5
// for example = 25 = XXV
// 10
// 5
// 1
// get the exceptions i.e I can only be placed behind v and x