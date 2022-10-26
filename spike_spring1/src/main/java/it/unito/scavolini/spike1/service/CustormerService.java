package it.unito.scavolini.spike1.service;

import it.unito.scavolini.spike1.model.Customer;

import java.util.List;

public interface CustormerService {

    //extract all instance of Customer
    List<Customer> findAll();
}
