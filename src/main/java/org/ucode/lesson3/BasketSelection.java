package org.ucode.lesson3;

public class BasketSelection {
    public static void main(String[] args) {
        Student st1 = new Student("dec", "lan", 150);
        Student st2 = new Student("ann", "rosu", 150);
        Student st3 = new Student("on", "off", 150);

        Student[] studentArray = new Student[3];
        studentArray[0] = st1;
        studentArray[1] = st2;
        studentArray[2] = st3;
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Element " + i);

          //  if (studentArray[i] != null) {
              //  printTheNameOfEligibleStudents(studentArray[i], 150);
           // }
        }
    }
}