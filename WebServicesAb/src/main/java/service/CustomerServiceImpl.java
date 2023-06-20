package service;


import model.Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    List<Customers> list;
    public CustomerServiceImpl(){
        list=new ArrayList<> ();
        list.add(new Customers (110,"Abhishek","Male",732373293,"abhishek@gmail.com"));
        list.add (new Customers (102,"Thamesh","Male",988823234,"thamesh@gmail.com"));
        list.add (new Customers (103,"Rajneesh","Male",873284598,"rajneesh@gmail.com"));
    }
    @Override
    public List<Customers> getCustomer() {
        return list;
    }

    public Customers add(Customers customer) {
        return customer;
    }

}
