package it.unito.scavolini.spring_db_spike.repository;

import it.unito.scavolini.spring_db_spike.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //extract all instance of Customer
    List<Customer> findAll();

    List<Customer> findByAge(int age);

    Customer save(Customer customer);

}
