package model;


public class LoanClass {
    private String startDate;
    private String endDate;
    private int tenure;
    private double roi;
    private double amount;
    private int emisPaid;
    private String pendingEmiDetails;
    private String repaymentSchedule;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getEmisPaid() {
        return emisPaid;
    }

    public void setEmisPaid(int emisPaid) {
        this.emisPaid = emisPaid;
    }

    public String getPendingEmiDetails() {
        return pendingEmiDetails;
    }

    public void setPendingEmiDetails(String pendingEmiDetails) {
        this.pendingEmiDetails = pendingEmiDetails;
    }

    public String getRepaymentSchedule() {
        return repaymentSchedule;
    }

    public void setRepaymentSchedule(String repaymentSchedule) {
        this.repaymentSchedule = repaymentSchedule;
    }
}