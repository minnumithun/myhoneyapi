package com.mvm.myhoneyapi.controller;

import com.mvm.myhoneyapi.dto.CustomerDto;
import com.mvm.myhoneyapi.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping("/byId/{id}")
    public Optional<CustomerDto> getById(@PathVariable("id") Long id) {
        return customerRepository.findById(id);
    }

    @GetMapping("/byName/{firstName}")
    public Optional<CustomerDto> getByName(@PathVariable("firstName") String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    @GetMapping("/exist/{email}")
    public boolean verifyEmail(@PathVariable("email") String email) {
        return customerRepository.existsByEmail(email);
    }

    @GetMapping("/getAll")
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("/add")
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) {
        return customerRepository.save(customerDto);
    }

    @DeleteMapping("/delete")
    public String deleteCustomer(@PathVariable("id") Long id) {
        customerRepository.deleteById(id);
        return "Customer:" + id + " deleted";
    }
}
