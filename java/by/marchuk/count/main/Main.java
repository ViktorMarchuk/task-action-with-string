package by.marchuk.count.main;

public class Main{
    public static void main(String[] args){
        String st = "He,ll,o";
        String st1 = "5665r4";
        String st2 = "melon";
        System.out.println("The count of repeating characters ',' is  " + showAmount(st));
        System.out.println(checkString(st1));
        countLetters(st2);
        System.out.println("Number of similar characters is " + countSimilarChar("weer", 'w'));

    }

    public static int showAmount(String s){
        char[] stringToChar = s.toCharArray();
        int count = 0;
        for(int i = 0; i < stringToChar.length; i++){
            if(stringToChar[i] == ','){
                count++;
            }
        }
        return count;
    }

    public static boolean checkString(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public static void countLetters(String s){
        char[] ch = s.toCharArray();
        int amountVowels = 0;
        int amountConsonants = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                amountVowels++;
                amountConsonants = s.length() - amountVowels;
            }
        }
        System.out.println("Number of vowels is " + amountVowels);
        System.out.println("Number of consonants is " + amountConsonants);
    }

    public static int countSimilarChar(String s, char c){
        int count = 0;
        char[] chars = s.toCharArray();
        for(char ch: chars){
            if(ch == c){
                count++;
            }
        }
        return count;
    }
}

//        The count of repeating characters ',' is  2
//        false
//        Number of vowels is 2
//        Number of consonants is 3
//        Number of similar characters is 1
