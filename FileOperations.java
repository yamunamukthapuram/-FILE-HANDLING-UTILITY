import java.util.Scanner;

public class FileOperations {

    // Simulate a file using a String
    private static String fileContent = "";

    
    public static void readFile() {
        System.out.println("File Content:");
        System.out.println(fileContent);
    }

   
    public static void writeFile(String content) {
        fileContent = content;
        System.out.println("Content written to file.");
    }

    
    public static void modifyFile(String newContent) {
        fileContent += "\n" + newContent;
        System.out.println("Content appended to file.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write to file
        System.out.println("Enter content to write to the file:");
        String content = scanner.nextLine();
        writeFile(content);

        // Read from file
        System.out.println("\nReading the file after writing:");
        readFile();

        // Modify file
        System.out.println("\nEnter additional content to append to the file:");
        String newContent = scanner.nextLine();
        modifyFile(newContent);

        // Read from file after modification
        System.out.println("\nReading the file after modification:");
        readFile();

        scanner.close();
    }
}
