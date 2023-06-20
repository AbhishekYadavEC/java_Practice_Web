package wspkg.day2;

import model.LoanClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/webservice")
public class LoanControllers {

    @GET
    @Path("/loans/overdue")
    @Produces(MediaType.APPLICATION_JSON)
    public List<LoanClass> getOverdueLoans() {
        // Dummy data
        List<LoanClass> loans = new ArrayList<> ();
        LoanClass loan1 = new LoanClass ();
        loan1.setStartDate("2022-01-01");
        loan1.setEndDate("2023-01-01");
        loan1.setTenure(12);
        loan1.setRoi(10.0);
        loan1.setAmount(100000.0);
        loan1.setEmisPaid(6);
        loan1.setPendingEmiDetails("2 EMIs pending");
        loan1.setRepaymentSchedule("Monthly");

        LoanClass loan2 = new LoanClass ();
        loan2.setStartDate("2022-02-01");
        loan2.setEndDate("2023-02-01");
        loan2.setTenure(12);
        loan2.setRoi(10.0);
        loan2.setAmount(200000.0);
        loan2.setEmisPaid(8);
        loan2.setPendingEmiDetails("4 EMIs pending");
        loan2.setRepaymentSchedule("Monthly");

        loans.add(loan1);
        loans.add(loan2);

        return loans.stream().filter(l -> l.getPendingEmiDetails().contains("pending")).collect(Collectors.toList());
    }
}

