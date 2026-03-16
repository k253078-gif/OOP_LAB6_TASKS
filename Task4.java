// Base class
class Account {

    double balance = 10000;
}

// SavingsAccount inherits Account
class SavingsAccount extends Account {
}

// PremiumSavings inherits SavingsAccount
class PremiumSavings extends SavingsAccount {

    void calculateInterest() {

        double interest = balance * 0.07;

        // Casting to integer
        int intInterest = (int) interest;

        System.out.println("Interest (integer value): " + intInterest);
    }
}

 class Main3 {
    public static void main(String[] args) {

        PremiumSavings p = new PremiumSavings();

        p.calculateInterest();
    }
}