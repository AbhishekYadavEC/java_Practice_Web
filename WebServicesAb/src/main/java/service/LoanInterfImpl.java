package service;

import model.Loan1;

import java.util.ArrayList;
import java.util.List;

public class LoanInterfImpl implements LoanInterf{
    List<Loan1> loan1List;

    public LoanInterfImpl(){
        loan1List=new ArrayList<> ();
        loan1List.add (new Loan1 (101,"12-02-2003","12-05-2003",3,2,230000.0,2500,5000,2));
        loan1List.add (new Loan1 (102,"12-02-2003","12-05-2003",3,2,230000.0,2500,5000,2));
        loan1List.add (new Loan1 (103,"12-02-2003","12-05-2003",3,2,230000.0,2500,5000,2));
    }
    @Override
    public List<Loan1> getLoanList() {
        return loan1List;
    }
}
