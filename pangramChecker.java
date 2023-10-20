import java.util.Scanner;
   class pangramChecker {
      public static void main(String[] args) {
        System.out.println("Enter a sentence to check if it's a pangram:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }        
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (input.indexOf(letter) == -1) {
                return false; 
            }
        }
        return true; 
    }  
}