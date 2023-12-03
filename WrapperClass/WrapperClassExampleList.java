package WrapperClass;

import java.util.ArrayList;

public class WrapperClassExampleList {
    public static void main(String[] args) {

        // สร้าง ArrayList ที่ใช้ Integer
        ArrayList<Integer> integerList = new ArrayList<>();

        // เพิ่มข้อมูลใน ArrayList โดยใช้ wrapper class Integer
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(20));
        integerList.add(Integer.valueOf(30));

        // แสดงผลข้อมูลใน ArrayList
        System.out.println("Data in integerList:");
        for (Integer value : integerList) {
            System.out.println(value);
        }

        // การดึงข้อมูลออกมาจาก ArrayList
        int firstElement = integerList.get(0); // auto-unboxing
        System.out.println("Element 1: " + firstElement);
    }
}
