package guru.qa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Read {
    public Inf reader() throws IOException {
        Path path = Path.of("src/test/resources/text.text");
        List<String> l = Files.readAllLines(path);
        return  new Inf(l.get(0),l.get(1),l.get(2),l.get(3),l.get(4),l.get(5),l.get(6),l.get(7),l.get(8),l.get(9),l.get(10),l.get(11));
    }
}
