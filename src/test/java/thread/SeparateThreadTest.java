package thread;

import org.junit.Test;

/**
 * Created by Ghazi Ennacer on 27/12/2017.
 */
public class SeparateThreadTest {

    @Test
    public void testThread(){
        SeparateThread<String> firstName;
        SeparateThread<String> lastName;
        firstName = new SeparateThread<>("Itachi");
        lastName = new SeparateThread<>("Uchiha");
        System.out.println(firstName.get());
        System.out.println(lastName.get());

        firstName.value = "Shikamaru";
        lastName.value = "Nara";

        System.out.println(firstName.get());
        System.out.println(lastName.get());
    }
}
