import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String path = getPath();
        Checker.checkLastLine(path);
        System.out.println(Calculator.calculate(path));

    }


    private static String getPath() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets give a path to the file ->  NAMEDISC:\\directory\\file.txt");
        return scan.nextLine();
    }
}