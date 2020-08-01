import java.util.Scanner;

public class practice_multiple_choice1 {
    public static void main(String args[]) {
        String question = "What is magic the gathering";
        String choiceOne = "It is life";
        String choiceTwo = "A waste of time and money";
        String choiceThree = "Very affordable";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as
        // what the correct choice was.

        boolean choice = true;
        Scanner scanner = new Scanner(System.in);

        while(choice) {
            System.out.println("Answer the question");
            System.out.println(question);
            System.out.println("");
            System.out.println(choiceOne);
            System.out.println(choiceTwo);
            System.out.println(choiceThree);
            System.out.println("");

            String userInput = scanner.next();

            if (correctAnswer.equals(userInput)) {
                System.out.println("Correct");
                choice = false;
            }

        }
        System.out.println("Correct");
    }
}
