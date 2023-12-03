package Collections.ArrayList;

class Main {
    public static void main(String[] args) {
        StudentArrayList[] studentsArray = new StudentArrayList[2];

        StudentArrayList std_1 = new StudentArrayList();
        std_1.setFirstName("Harry");
        std_1.setLastName("Potter");
        std_1.setHouse("Gryffindor");
        std_1.set_class(3);
        std_1.setintegerAge(15);
        studentsArray[0] = std_1;

        StudentArrayList std_2 = new StudentArrayList();
        std_2.setFirstName("Hermione");
        std_2.setLastName("Granger");
        std_2.setHouse("Gryffindor");
        std_2.set_class(3);
        std_2.setintegerAge(15);
        studentsArray[1] = std_2;

        // Create an instance of HouseArray
        HouseArray house = new HouseArray();

        // Call setStudents with the correct argument
        house.setStudents(studentsArray);

        // Access students from the HouseArray instance
        for (int i = 0; i < house.getStudents().length; i++) {
            System.out.println(house.getStudents()[i].getFirstName() + " | " +
                    house.getStudents()[i].getLastName() + " | " +
                    house.getStudents()[i].getHouse() + " | " +
                    house.getStudents()[i].get_class() + " | " +
                    house.getStudents()[i].getintegerAge());
        }
    }
}
