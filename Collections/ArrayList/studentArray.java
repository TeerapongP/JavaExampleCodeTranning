package Collections.ArrayList;

public class studentArray {
    private String firstName;
    private String lastName;
    private String house;

    private int _class;
    private int integerAge;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void set_class(int _class) {
        this._class = _class;
    }

    public void setintegerAge(int integerAge) {
        this.integerAge = integerAge;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getHouse() {
        return this.house;
    }

    public int get_class() {
        return this._class;
    }

    public int getintegerAge() {
        return this.integerAge;
    }
}

class HouseArray {
    private StudentArrayList[] studentData;

    public void setStudents(StudentArrayList[] students) {
        this.studentData = students;
    }

    public StudentArrayList[] getStudents() {
        return this.studentData;
    }
}
