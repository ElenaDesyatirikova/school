//import java.util.Date;

public class Student extends Person {

    private String groupName;

    public Student (String firstName, String lastName, int dateOfBirth, char sex, String groupName) {
        super (firstName, lastName, dateOfBirth, sex);
        this.groupName = groupName;
    }

    public String getGroupName () {
        return groupName;
    }

    public void setGroupName (String groupName) {
        this.groupName = groupName;
    }


    public String printStudentInfo (){
        return (getFirstName() + " " + getLastName() + " " + getDateOfBirth() + " " + getSex()+ " " + getGroupName());
    }


}
