package Collections.ArrayList;

import java.util.ArrayList;

public class arrayListStudent {
    public static void main(String[] args) {

        ArrayList<StudentArrayList> studentList = new ArrayList<>();
        House house = new House();

        StudentArrayList std_1 = new StudentArrayList();
        StudentArrayList std_2 = new StudentArrayList();

        std_1.setFirstName("Harry");
        std_1.setLastName("Potter");
        std_1.setHouse("Gryffindor");
        std_1.set_class(3);
        std_1.setintegerAge(15);
        studentList.add(std_1);

        std_2.setFirstName("Hermione");
        std_2.setLastName("Granger");
        std_2.setHouse("Gryffindor");
        std_2.set_class(3);
        std_2.setintegerAge(15);
        studentList.add(std_2);

        house.setStudent(studentList);

        for (int i = 0; i < house.getStudent().size(); i++) {
            System.out.println(studentList.get(i).getFirstName() + " | " + studentList.get(i).getLastName() + " | "
                    + studentList.get(i).getHouse() + " | " + studentList.get(i).get_class() + " | "
                    + (studentList.get(i).getintegerAge()));
        }
    }
}
