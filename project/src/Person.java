//import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private char sex;

    public Person (String firstName, String lastName, int dateOfBirth, char sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getDateOfBirth () {
        return dateOfBirth;
    }

    public char getSex () {
        return sex;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth (int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex (char sex) {
        this.sex = sex;
    }

}
