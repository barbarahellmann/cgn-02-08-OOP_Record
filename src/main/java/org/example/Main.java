package org.example;

public class Main {
    public static void main(String[] args) {



//Class -° Muss nicht immutable sein -> Hat die Möglichkeit Setter bereit zu stellen /bzw. Werte zu ändern.

Student student = new Student("Max", "Muster", 45);

student.getFirstName();
student.getLastName();
student.getAge();
        System.out.println(student);
student.setLastName("Mustermann");
        System.out.println(student);



// Record -> Ist Immutable, wir können nichts ändern!
StudentR studentR = new StudentR("Max", "Muster", 45);
studentR.firstName();
studentR.lastName();
studentR.age();
studentR = new StudentR(studentR.firstName(), "Mustermann", studentR.age());
        System.out.println(studentR);

    }
}