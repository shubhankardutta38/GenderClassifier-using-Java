import java.util.Scanner;

public class GenderClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine().trim().toLowerCase();

        char lastChar = name.charAt(name.length() - 1);
        String gender;

        if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i') {
            gender = "female";
        } else {
            gender = "male";
        }

        System.out.println(name + " is classified as a " + gender + " name.");

        scanner.close();
    }
}
