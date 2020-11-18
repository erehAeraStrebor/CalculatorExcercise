import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Reader {

    static LinkedList<String> fileLines;

    static LinkedList<String> read(String path) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException fexc) {
            throw new RuntimeException("File not found");
        }
        fileLines = reader.lines().collect(Collectors.toCollection(LinkedList::new));
        return fileLines;
    }
}
