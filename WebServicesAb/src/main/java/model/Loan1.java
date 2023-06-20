package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Loan1 {
    private int id;
    private String startDate;
    private String  endDate;
    private int tenure;
    private double roi;
    private double amount;
    private int emisPaid;
    private int pendingEmis;
    private int repaymentSchedule;

    public Loan1(int id, String startDate, String endDate, int tenure, double roi, double amount, int emisPaid, int pendingEmis, int repaymentSchedule) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tenure = tenure;
        this.roi = roi;
        this.amount = amount;
        this.emisPaid = emisPaid;
        this.pendingEmis = pendingEmis;
        this.repaymentSchedule = repaymentSchedule;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getPendingEmis() {
        return pendingEmis;
    }

    public void setPendingEmis(int pendingEmis) {
        this.pendingEmis = pendingEmis;
    }

    public int getRepaymentSchedule() {
        return repaymentSchedule;
    }

    public void setRepaymentSchedule(int repaymentSchedule) {
        this.repaymentSchedule = repaymentSchedule;
    }
}
