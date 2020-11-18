import java.util.LinkedList;

public class Checker {

    static void checkLastLine(String path) {
        LinkedList<String> fileLines = Reader.read(path);
        String lastLine = fileLines.peekLast();
        String[] tokens = lastLine.split(" ");
        String shouldBeApply = tokens[0];
        String startValue = tokens[1];
        if (!("apply").equals(shouldBeApply)) {
            throw new IllegalArgumentException("Cannot find apply instruction at last line");
        }

        Calculator.sum = Integer.parseInt(startValue);
    }
}

