package ex3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileService {

    public FileService() {
    }

    private static FileService fileService;

    public static FileService getInstance() {
        if (fileService == null) {
            fileService = new FileService();
        }
        return fileService;
    }

    private List<File> readAllFiles(String path) {
        List<File> files = new ArrayList<>();
        try {
            files = Files.list(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return files;
    }

    public List<String> readFile(File file) {
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = new ArrayList<>(Files.readAllLines(Paths.get(file.getAbsolutePath())));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileContent;
    }

    public List<List<String>> readFiles(String path) {
        List<File> files = readAllFiles(path);
        return files.stream().map(file -> this.readFile(file)).collect(Collectors.toList());
    }
}
