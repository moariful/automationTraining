import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by patrick.day on 3/9/15.
 */
public class ReadWrite {
    public static void main(String[] args) throws IOException{
        Path file = Paths.get("src/resources/test.txt");
        List<String> lines = Files.readAllLines(file, Charset.defaultCharset());
        for(String s : lines){
            System.out.println(s);
        }
    }
}
