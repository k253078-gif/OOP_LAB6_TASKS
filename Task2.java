// Base class
class Person {

    void displayPerson() {
        System.out.println("This is a person.");
    }
}

// Student inherits Person
class Student extends Person {

    void displayStudent() {
        System.out.println("This is a student.");
    }
}

// GraduateStudent inherits Student
class GraduateStudent extends Student {

    void research() {
        System.out.println("Graduate student is doing research.");
    }
}


 class Main1 {
    public static void main(String[] args) {

        GraduateStudent g = new GraduateStudent();

        // Calling all methods
        g.displayPerson();
        g.displayStudent();
        g.research();
    }
}