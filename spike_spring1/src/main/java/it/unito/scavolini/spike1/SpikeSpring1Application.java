package it.unito.scavolini.spike1;

import it.unito.scavolini.spike1.service.CustormerService;
import it.unito.scavolini.spike1.service.CustormerServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpikeSpring1Application {

    public static void main(String[] args) {

        CustormerService custormerService = new CustormerServiceImpl();
        System.out.println(custormerService.findAll().get(0).getName());
        System.out.println(custormerService.findAll().get(0).getSurname());

    }

}
