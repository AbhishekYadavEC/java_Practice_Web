package service;

import model.Customers;

import java.util.List;

public interface CustomerService {
    public List<Customers> getCustomer();


    Customers add(Customers customer);
}
