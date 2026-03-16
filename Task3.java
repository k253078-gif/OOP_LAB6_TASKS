// Parent class
class Employee1 {

    double salary = 50000;  // salary variable

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

// Child class
class PermanentEmployee extends Employee1 {

    void calculateBonus() {

        double bonus = salary * 0.10;

        // Casting double to integer
        int intBonus = (int) bonus;

        System.out.println("Bonus (integer value): " + intBonus);
    }
}

// Main class
 class Main2 {
    public static void main(String[] args) {

        PermanentEmployee p = new PermanentEmployee();

        p.displaySalary();

        p.calculateBonus();
    }
}