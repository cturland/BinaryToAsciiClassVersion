import java.util.Scanner;

public class BinaryASCIIConverter {

    private static Scanner sc = new Scanner(System.in);

    public static void run(){
        System.out.println(
                """
                1. Text to binary
                2. Binary to text
                3. Quit 
                Enter choice:\s       
                """
        );
        int choice = sc.nextInt();
        sc.nextLine(); // Buffer
        if (choice == 1){
            textToBinary();
        }
        else if (choice == 2) {
            binaryToText();
        }
    }

    private static void binaryToText() {
        System.out.println("Enter binary: ");
    }

    private static void textToBinary() {
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        // String.charAt()
        // int ascii = String.charAt(i);
        for(int i = 0; i < text.length(); i++){
            int ascii = text.charAt(i);
        }
    }
}
