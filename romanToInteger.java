import java.util.HashMap;
import java.util.Scanner;

class romanToInteger {
   public static void main(String[] args) {
        System.out.print("Enter a Roman numeral: ");
        Scanner scanner = new Scanner(System.in);
        String romanNumeral = scanner.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) 
            {
                result -= currentValue;
            }
             else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
