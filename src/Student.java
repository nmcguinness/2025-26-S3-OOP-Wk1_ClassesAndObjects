/*  Class names are PASCAL case e.g. BankAccount
    If the class represents a single entity then dont make it plural
    If the class represents a collection when name it using what and how e.g. StudentList, WeaponArray
*/
public class Student {

    //<editor-fold desc="Fields">
    //fields/attributes/state data are CAMEL case e.g. dateOfBirth, rateOfFire
    public String fName;
    public String lName;
    public short age;  //2-byte integer range [-32768 -> +32767]
    //</editor-fold>

    // <editor-fold desc="Getters & Setters">
    //getters and setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
    // </editor-fold>

    //<editor-fold desc="Constructors">
    //default constructor
    public Student() {
        this.fName = "first name";
        this.lName = "last name";
        this.age = (short)18;
    }

    //full constructor
    public Student(String fName, String lName, short age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    //</editor-fold>

    //<editor-fold desc="Overridden Methods">
    public boolean equals(Student other) {
        return this.age == other.getAge()
                && this.fName.equalsIgnoreCase(other.getfName())
                    && this.lName.equalsIgnoreCase(other.getlName());
    }


    public String toString() {
        return fName + ", " + lName + ", age: " + age;
    }
    //</editor-fold>
}
