//import java.util.Date;

import java.util.Date;

public class Group {

    private String groupName;
    private int monthDuration;
//    private Date dateOfBegin;
//    private Date dateOfEnd;

    public Group (String groupName, int monthDuration) {
        this.groupName = groupName;
        this.monthDuration = monthDuration;
    }

    public String getGroupName () {
        return groupName;
    }

/*    public Date getDateOfBegin () {
        return dateOfBegin;
    }

    public Date getDateOfEnd () {
        return dateOfEnd;
    }
*/
    public void setGroupName (String groupName) {
        this.groupName = groupName;
    }

    public int getMonthDuration () {
        return monthDuration;
    }

    public void setMonthDuration(int monthDuration) {
        this.monthDuration = monthDuration;
    }

    public String printGroupInfo (){
        return (getGroupName() + " " + getMonthDuration());
    }

/*    public void setDateOfBegin (Date dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public void setDateOfEnd (Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }
*/


}
