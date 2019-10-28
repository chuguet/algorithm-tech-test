package ex3;

import java.io.IOException;
import java.nio.file.*;

public class FileWatcher {

    private static FileWatcher fileWatcher;
    private static final String folderPath = "src/main/resources/";

    public FileWatcher() {

    }

    public static FileWatcher getInstance() {
        if (fileWatcher == null) {
            fileWatcher = new FileWatcher();
        }
        return fileWatcher;
    }

    public void watchOffers(String term) {

        Path filePath = Paths.get(folderPath);

        WatchService watchService;
        try {
            watchService = FileSystems.getDefault().newWatchService();

            //listen for create ,delete and modify event kinds
            filePath.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        boolean keyState = true;
        while (keyState) {
            WatchKey key;
            try {
                //return signaled key, meaning events occurred on the object
                key = watchService.take();
            } catch (InterruptedException ex) {
                return;
            }

            //retrieve all the accumulated events
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                Path path = (Path) event.context();
                if (kind.equals(StandardWatchEventKinds.ENTRY_MODIFY)) {
                    double tfIdf = TfIdfCalculation.getInstance().tfIdf(
                            FileService.getInstance().readFile(path.toFile()),
                            FileService.getInstance().readFiles(folderPath),
                            term);
                    System.out.println(path.getFileName() + " " + tfIdf);
                }
            }
            //resetting the key goes back ready state
            keyState = key.reset();
        }

    }

}
