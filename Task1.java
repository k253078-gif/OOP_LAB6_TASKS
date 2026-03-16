 // Parent class
    class Employee {

        // Method in parent class
        void work() {
            System.out.println("Employee is working.");
        }
    }

    // Child class inheriting Employee
    class Manager extends Employee {

        // Additional method in child class
        void manageTeam() {
            System.out.println("Manager is managing the team.");
        }
    }

    // Main class
     class Main {
        public static void main(String[] args) {

            Manager m = new Manager();

            m.work();

            m.manageTeam();
        }
    }
