package model;


public class Customers {
    private int customerId;
    private String customerName;
    private String gender;
    private long contactNumber;
    private String emailAddress;

    public Customers(int customerId, String customerName, String gender, long contactNumber, String emailAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber=" + contactNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
