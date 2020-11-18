import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    static int sum;

    static int calculate(String path) {

        Scanner scanner = tryToReadPath(path);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            if (tokens.length != 2) {
                throw new RuntimeException("incorrect number of args");
            }

            makeOperation(tokens);
        }
        return sum;
    }

    private static Scanner tryToReadPath(String path) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (IOException oexc) {
            System.out.println(oexc.getMessage());
        }
        return scanner;
    }

    private static void makeOperation(String[] tokens) {
        int number = Integer.parseInt(tokens[1]);
        String operation = tokens[0];
        switch (operation) {
            case "add":
                sum += number;
                break;
            case "substract":
                sum -= number;
                break;
            case "multiply":
                sum *= number;
                break;
            case "divide":
                sum /= number;
                break;
        }
    }
}

