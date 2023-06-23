import java.util.Scanner;

public class CharacterRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String userInput = input.nextLine();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (i + 1 < userInput.length() && Character.isDigit(userInput.charAt(i + 1))) {
                    int repeatCount = Character.getNumericValue(userInput.charAt(i + 1));
                    output.append(String.valueOf(currentChar).repeat(repeatCount));
                    i++;
                } else {
                    output.append(currentChar);
                }
            }
        }

        System.out.println("Output: " + output.toString());

        input.close();
    }
}
