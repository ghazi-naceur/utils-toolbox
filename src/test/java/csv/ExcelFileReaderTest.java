package csv;

import entity.Person;
import org.junit.Test;

import java.util.List;

/**
 * Created by Ghazi Ennacer on 26/12/2017.
 */
public class ExcelFileReaderTest {

    @Test
    public void testGetStudentsListFromExcel(){

        List<Person> studentList = ExcelFileReader.getStudentsListFromExcel();
        studentList.forEach(s -> System.out.println(String.format("%s %s %s %s", s.getFirstName(), s.getAge(), s.getRandomNumber(), s.getAnotherRandomNumber())));
        System.out.println(studentList);
    }
}
