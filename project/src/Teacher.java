//import java.util.Date;

public class Teacher extends Person{

    private String subject;

    public Teacher (String firstName, String lastName, int dateOfBirth, char sex, String subject) {
        super (firstName, lastName, dateOfBirth, sex);
        this.subject = subject;
    }

    public String getSubject () {
        return subject;
    }

    public void setSublect (String subject) {
        this.subject = subject;
    }

    public String printTeacherInfo (){
        return (getFirstName() + " " + getLastName() + " " + getDateOfBirth() + " " + getSex()+ " " + getSubject());
    }

}
