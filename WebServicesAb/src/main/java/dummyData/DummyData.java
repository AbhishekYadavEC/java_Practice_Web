package dummyData;

import model.Customer4;
import model.Loan;
import model.LoanEligibility;


public class DummyData {
    public static Customer4 getDummyCustomer() {
        Customer4 customer = new Customer4();
        customer.setName("John Doe");
        customer.setAge(30);
        customer.setIncome(60000);
        return customer;
    }
    public static Loan getDummyLoan() {
        Loan loan = new Loan ();
        loan.setAmount(500000);
        loan.setInterestRate(10);
        return loan;
    }
    public static LoanEligibility getDummyLoanEligibility() {
        LoanEligibility loanEligibility = new LoanEligibility();
        loanEligibility.setEligibleAmount(500000);
        loanEligibility.setInterestRate(10);
        return loanEligibility;
    }
}
