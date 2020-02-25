package Work;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CatalogPrinter {

    public static void main(String[] args) throws IOException {
        List<String> folders = new ArrayList<>();
        List<String> files = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(""))) {
            paths.forEach(p -> {
                if (Files.isRegularFile(p)) {
                    files.add(p.toString());
                } else {
                    folders.add(p.toString());
                }
            });
        }
        System.out.println(files);
        System.out.println(folders);
    }
}
