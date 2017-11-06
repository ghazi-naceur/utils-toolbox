package entity;

/**
 * Created by Ghazi Ennacer on 06/11/2017.
 */
public class Person {

    private String firstName;
    private Float randomNumber;
    private Float age;
    private Float anotherRandomNumber;

    public Person() {
        super();
    }

    public Person(String firstName, Float randomNumber, Float age, Float anotherRandomNumber) {
        this.firstName = firstName;
        this.randomNumber = randomNumber;
        this.age = age;
        this.anotherRandomNumber = anotherRandomNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Float getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(Float randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public Float getAnotherRandomNumber() {
        return anotherRandomNumber;
    }

    public void setAnotherRandomNumber(Float anotherRandomNumber) {
        this.anotherRandomNumber = anotherRandomNumber;
    }
}
