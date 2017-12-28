package file;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Optional;
import java.util.Properties;

/**
 * Created by Ghazi Ennacer on 27/12/2017.
 */
public class FileUtilitiesTest {

    @Test
    public void testCreateFolder() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String directory = prop.getProperty("directory");
        String dir = "testFolder";
        FileUtilities.createFolder(new File(directory + File.separator + dir));
    }

    @Test
    public void testSearchFileInFolder() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("directory");
        Optional<File> file = FileUtilities.searchFileInFolder(new File(folder), "file1.txt");
        System.out.println(file.get());
    }

    @Test
    public void testRenameFile() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("directory");
        File file = FileUtilities.renameFile(new File(folder + File.separator + "file3.txt"), "file33.txt");
        System.out.println(file);
    }

    @Test
    public void testCopyFile() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("directory");
        FileUtilities.copyFile(new File(folder + File.separator + "movedFile.txt"),
                new File(folder + File.separator + "file3.txt"));
    }

    @Test
    public void testMoveFile() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("directory");
        FileUtilities.moveFile(new File(folder + File.separator + "movedFiled.txt"),
                new File(folder + File.separator + "movedFile.txt"));
    }

    @Test
    public void testFilesWithTheSameNames() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("folder");
        File file = new File(folder);
        System.out.println(file.getName());
        boolean result = FileUtilities.filesWithTheSameNames(file, "file2");
        System.out.println(result);
    }

    @Test
    public void testWriteBytesToFile() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String directory = prop.getProperty("directory");
        byte[] bytes = "This is a test".getBytes();
        FileUtilities.writeBytesToFile(bytes, new File(directory + File.separator + "fromBytesToFile.txt"));
    }

    @Test
    public void testConvertFileToStream() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("folder");
        InputStream inputStream = FileUtilities.convertFileToStream(Paths.get(folder));
        System.out.println(inputStream.toString());
    }

    @Test
    public void testConvertFileToBytes() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("folder");
        byte[] bytes = FileUtilities.convertFileToBytes(Paths.get(folder));
        System.out.println(bytes);
    }

    @Test
    public void testListFilesInFolder() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String directory = prop.getProperty("directory");
        Collection<File> files = FileUtilities.listFilesInFolder(new File(directory));
        files.forEach(f -> System.out.println(f.getName().toString()));
    }

    @Test
    public void testDelete() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.properties"));
        String folder = prop.getProperty("folder");
        Boolean res = FileUtilities.delete(new File(folder));
        System.out.println(res);
    }
}
