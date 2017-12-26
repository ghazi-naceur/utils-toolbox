package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ghazi Ennacer on 26/12/2017.
 */
public class CustomDateSerializerTest {

    @Test
    public void testSerialize(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person person = mapper.readValue(new File("E:\\GitHubRepositories\\bungee-gum\\src\\main\\resources\\json\\input.json"), Person.class);
            mapper.writeValue(new File("E:\\GitHubRepositories\\bungee-gum\\src\\main\\resources\\json\\output.json"), person);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
