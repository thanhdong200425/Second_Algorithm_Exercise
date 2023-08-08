import java.util.Scanner;

public class Exercise1 {
    static String sortArray(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if ((int) ch[j] < (int) ch[i]) {
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
        String newString = new String(ch);
        return newString;
    }

    static boolean checkCondition(String a, String b) {
        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();
        int lengthOfB = chB.length;
        int count = 0;
        for(int i = 0; i < chA.length ; i++) {
            if(chA[i] == chB[lengthOfB - 1]) {
                count++;
            } 
            lengthOfB--;
        }
        if(count == chA.length) {
            return true;
        } else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        // Sort array follow ASCII 
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // String newS = Exercise1.sortArray(s);
        // System.out.println(newS.toString());

        //Check condition
        System.out.println(Exercise1.checkCondition("abc", "cbd"));
    }
}