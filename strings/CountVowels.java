// CountVowels: simple beginner-friendly example.
public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World".toLowerCase(); 
        int count = 0;
        for (char letter : input.toCharArray()) {
            if ("aeiou".indexOf(letter) != -1) {
                count++;
            }
        }
        // for(int i=0;i<input.length();i++){
        //     char c = input.charAt(i);
        //     if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u'){
        //         count++;
        //     }
        // }
        System.out.println("Vowels = " + count);
    }
}
// in this i solved the problem in which you are checking for consonents means ==-1 but the correct condition is to check for vowels which is !=-1
//and i also added second method which is simple according to me to count vowels in a string 
