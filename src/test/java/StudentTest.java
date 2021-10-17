import org.joda.time.DateTime;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String args[]) {
        ArrayList<Course> courses = new ArrayList<Course>();

        //creating student objects
        Student sdt0 = new Student("John", 21, "30-01-2000", 1534);
        Student sdt1 = new Student("Mary", 19, "30-01-2002", 1354);
        Student sdt2 = new Student("James", 20, "30-01-2001", 1435);
        Student sdt3 = new Student("Brian", 22, "30-01-1999", 1435);



        //creating module objects
        Module md0 = new Module("EE123", 1023);
        Module md1 = new Module("EE132", 1302);
        Module md2 = new Module("EE213", 1230);

        //setting values for the start and end date of the courses
        DateTime crStartDate = new DateTime(2021, 9, 05, 0, 0);
        DateTime crEndDate = new DateTime(2022, 5, 10, 0, 0);


        Course cr0 = new Course("Electronic & Computer Engineering", crStartDate, crEndDate);
        Course cr1 = new Course("Computer Science & IT", crStartDate, crEndDate);

        courses.add(cr0);
        courses.add(cr1);

        //set individual modules
        sdt0.setStudentModule(md0);sdt0.setStudentModule(md1);
        sdt1.setStudentModule(md1);sdt1.setStudentModule(md2);
        sdt2.setStudentModule(md0);sdt2.setStudentModule(md1);
        sdt3.setStudentModule(md1);sdt2.setStudentModule(md2);


        //set individual courses
        sdt0.setStudentCourse(cr0);
        sdt1.setStudentCourse(cr1);
        sdt2.setStudentCourse(cr0);
        sdt2.setStudentCourse(cr1);

        cr0.addModule(md0);
        cr0.addModule(md1);

        cr1.addModule(md1);
        cr1.addModule(md2);

        String str = "";
        int i ;

        //could reduce code more here but didn't have time to spend  printing out course students and modules
        for(i = 0 ; i < courses.size() ; i++) {
            str += "\n";
            str += "\n";
            str += "The Modules in Course " + i + " are: " + courses.get(i).getModuleList().get(0).getModuleName() + " & " + courses.get(i).getModuleList().get(1).getModuleName();
            str += "\n";
            str += "The students attending these modules are: " + courses.get(i).getStudentList().get(0).getUsername() + " & " + courses.get(i).getStudentList().get(1).getUsername();
        }

        System.out.println(str);

    }



}

