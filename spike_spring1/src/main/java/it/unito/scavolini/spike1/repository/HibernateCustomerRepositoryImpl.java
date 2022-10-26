package it.unito.scavolini.spike1.repository;

import it.unito.scavolini.spike1.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer("Mario", "Rossi");
        customers.add(customer);
        return customers;
    }

}
