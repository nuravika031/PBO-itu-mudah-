package number4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tester {

    public static void main(String[] args) {
        // Membaca input dari file input.txt dan output dari file output.txt
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        String input = readFromFile(inputFileName);
        String expectedOutput = readFromFile(outputFileName);

        // Menjalankan program yang akan diuji
        String actualOutput = runProgram(input);

        // Membandingkan output yang dihasilkan dengan output yang seharusnya
        if (expectedOutput.equals(actualOutput)) {
            System.out.println("Result : Program berhasil");
            System.out.println("VALID: Output program sudah sesuai dengan yang seharusnya.");
        } else {
            System.out.println("Result : Program berhasil");
            System.out.println("TIDAK VALID: Output program tidak sama dengan yang seharusnya.");
        }
    }

    // Metode untuk membaca teks dari file
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Metode untuk menjalankan program yang diuji dan mengembalikan outputnya
    private static String runProgram(String input) {
        StringBuilder output = new StringBuilder();
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "testing.Matriks");
            pb.redirectInput(new File("input.txt"));
            pb.redirectOutput(new File("result.txt"));
            Process process = pb.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("result.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }
}
