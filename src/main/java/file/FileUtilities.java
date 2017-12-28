package file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Predicate;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by Ghazi Ennacer on 27/12/2017.
 */
public class FileUtilities {

    public FileUtilities() {
        super();
    }

    public static void createFolder(File folder){
        folder.mkdirs();
    }

    public static boolean filesWithTheSameNames(File file, String name){
        String fileName = file.getName();
        String n = fileName.substring(0, fileName.lastIndexOf("."));
        return name.equals(n);
    }

    public static void writeBytesToFile(byte[] bytes, File file) throws IOException {
        Files.write(file.toPath(), bytes, APPEND, CREATE);
    }

    public static InputStream convertFileToStream(Path path) throws IOException {
        SeekableByteChannel in = Files.newByteChannel(path);
        return Channels.newInputStream(in);
    }

    public static byte[] convertFileToBytes(Path path) throws IOException {
        return Files.readAllBytes(path);
    }

    public static Collection<File> listFilesInFolder(File directory){
        File[] files = directory.listFiles();
        if(files != null){
            return Arrays.asList(files);
        }
        return Collections.EMPTY_SET;
    }

    public static Optional<File> searchFileInFolder(File folder, String fileName) {
        File[] files = folder.listFiles();
        return Arrays.asList(files).stream().filter(f -> f.getName().equals(fileName)).findAny();
    }

    public static Boolean delete(File file){
        try {
            if (file.isDirectory()) {
                File[] children = file.listFiles();
                if (children != null) {
                    Arrays.stream(children).forEach((file1) -> delete(file1));
                }
            }
            return Files.deleteIfExists(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
