package it.unito.scavolini.spike1.service;

import it.unito.scavolini.spike1.model.Customer;
import it.unito.scavolini.spike1.repository.CustomerRepository;
import it.unito.scavolini.spike1.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustormerServiceImpl implements CustormerService {

    private final CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

        @Override
        public List<Customer> findAll() {
            return customerRepository.findAll();
        }
}
