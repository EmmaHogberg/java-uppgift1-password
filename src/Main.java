import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String password = "marcus";

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ange ditt namn (med små bokstäver) som lösenord för att få veta vad jag heter: ");
            String passwordAnswer = reader.nextLine();

            if (passwordAnswer.equals(password)) {
                System.out.println("Det var rätt lösenord, jag heter Emma");
                break;
            } else if (i == 1 || i == 2) {
                System.out.println("Det var fel lösenord, försök igen. Detta var försök " + i + " av 3");

            } else {
                System.out.println("Det var fel lösenord och du har förbrukat dina 3 försök, hejdå!");
            }
            
            System.out.print(System.lineSeparator());
        }

    }

}
