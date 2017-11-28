package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
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
