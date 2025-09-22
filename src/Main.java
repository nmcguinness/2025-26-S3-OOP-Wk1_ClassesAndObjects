
public class Main {
    public static void main(String[] args) {
        Main myApp = new Main();

        myApp.start();
    }

    public void start() {

        System.out.println("Running Exercise 1...");
        demoStudent();

        System.out.println("Demo student equals...");
        demoStudentEquals();
    }

    private void demoStudentEquals()
    {
        Student s1 = new Student("John","Smith", (short)32);
        Student s2 = new Student("Jane", "Doe", (short)29);
        Student s3 = new Student("John","Smith", (short)32);

        Student s4;          //s4 is a variable of type Student that stores address of Student object
        s4 = new Student("Bob","Murphy",(short)19);     //putting address in RAM of the new Student object into s4

        //making s5 point to same object as s1 (i.e. same RAM address)
        Student s5 = s1;

        // == is the comparison operator which compares memory address
        if(s1 == s2)
            System.out.println("s1 and s2 are same!");
        if(s1 == s5)
            System.out.println("s1 and s3 are same!");

        // comparing actual contents
        if(s1.equals(s3))
            System.out.println("s1 and s3 are same");

    }

    private void demoStudent() {
        Student myStudent = new Student();

    }
}