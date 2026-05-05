package TaiyariDSA.string;

public class CountVowelsAndConsonent {
    public static void main(String[] args) {
        String str = "aeiou";
        int vowels = 0, consonents = 0;
        for(char ch : str.toCharArray()){
           if("aeiouAEIOU".indexOf(ch) !=-1){
               vowels++;
           }else if(Character.isLetter(ch)){
               consonents++;
           }
        }
        System.out.println("Vowels : " + vowels + ",,,,,," + "Consonents : " +consonents);
    }
}
