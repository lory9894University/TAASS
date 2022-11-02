package it.unito.scavolini.spring_db_spike.Controller;

import it.unito.scavolini.spring_db_spike.model.Customer;
import it.unito.scavolini.spring_db_spike.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        System.out.println("Get all Customers...");

        List<Customer> customers = repository.findAll();

        return customers;

    }

    @PostMapping("/customers/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        System.out.println("Create Customer: " + customer.getName() + "...");

        Customer _customer = repository.save(new Customer(customer.getName(), customer.getSurname(), customer.getAge(), customer.isActive()));
        return _customer;
    }
}
