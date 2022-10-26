package it.unito.scavolini.spike1.repository;

import it.unito.scavolini.spike1.model.Customer;

import java.util.List;

public interface CustomerRepository {

    //extract all instance of Customer
    List<Customer> findAll();
}
