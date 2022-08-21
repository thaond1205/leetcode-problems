public class palindrome_number {

    public static Boolean palindromeNumber(int x) {
        String number = String.valueOf(x);
        StringBuilder strB = new StringBuilder();
        strB.append(number);
        StringBuilder strC = new StringBuilder();
        for (int i = strB.length()-1; i >= 0; i--) {
            strC.append(strB.charAt(i));
        }

        if(strC.toString().equals(String.valueOf(x))){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println( palindromeNumber(121));

    }
}
