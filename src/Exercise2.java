import java.util.ArrayList;

public class Exercise2 {

    static int result(ArrayList<Integer> list) {
        int count = 0;
        for(int num : list) {
            if(isHasPrime(num, list)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isHasPrime(int n, ArrayList<Integer> list) {
        for(int i = 0; i < list.size() ; i++) {
            try {
                if( isPrime(list.get(i)) && isPrime(list.get(i+1)) && (list.get(i) + list.get(i+1) == n - 1) )  {
                return true;
            } 
            } catch (IndexOutOfBoundsException e) {
                return false;
            }
        }
        return false;
    }

    static ArrayList listOfPrimeNumbers(int l, int r) {
        ArrayList newArr = new ArrayList<Integer>();
        for(int i = l ; i <= r ; i++) {
            if(isPrime(i)) {
                newArr.add(i);
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = Exercise2.listOfPrimeNumbers(1, 40);
        System.out.println(Exercise2.result(arr));
    }
}
