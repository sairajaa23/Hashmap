import java.util.*;
public class FrequencyCharMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = in.nextLine();

        HashMap<Character,Integer> Freqmap = new HashMap<>();
        for(int i= 0 ; i< str.length() ; i++) {
            Character ch=str.charAt(i);
            Freqmap.computeIfPresent(ch, (character,count)-> count+1);
            Freqmap.putIfAbsent(ch, 1);
        }
        System.out.println(Freqmap);
    }
}
