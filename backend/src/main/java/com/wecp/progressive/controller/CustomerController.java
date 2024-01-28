package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImpl service;
    
    @GetMapping("/customers")
    public ResponseEntity<List<Customers>> getAllCustomers() {
        return null;
    }

    @GetMapping("/customers/{customerID}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) {
        // try {
        //     return new ResponseEntity<>(service.getCustomerById(customerId),HttpStatus.OK);
        // } catch (SQLException e) {
        //     // TODO Auto-generated catch block
        //     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        // }
        return null;
    }

    @PostMapping("/customers")
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) {
        // try {
        //     return new ResponseEntity<>(service.addCustomer(customers),HttpStatus.OK);
        // } catch (SQLException e) {
        //     // TODO Auto-generated catch block
        //     return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        // }
        return null;
    }
 
    @PutMapping("/customers/{customerID}")
    public ResponseEntity<Void> updateCustomer(int customerId, Customers customers) {
        // try {
        //     //ResponseEntity rs=new ResponseEntity<>(service.updateCustomer(customers);)
           
        
        // } catch (SQLException e) {
        //     // TODO Auto-generated catch block
        //     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        // }
        return null;
    }
    @DeleteMapping("/customers/{customerID}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) {
        return null;
    }

    @GetMapping("/customers/fromArrayList")
    public ResponseEntity<List<Customers>> getAllCustomersFromArrayList() {
        return null;
    }

    
    @GetMapping("/customers/toArrayList")
    public ResponseEntity<List<Customers>> addCustomersToArrayList(Customers customers) {
        //customersList.add(customers);
        return null;
    }

    @GetMapping("/customers/fromArrayList")
    public  ResponseEntity<List<Customers>> getAllCustomersSortedByNameFromArrayList(){
        // List<Customers> sortedCustomers = customersList;
        // Collections.sort(sortedCustomers);
        // return sortedCustomers;
        return null;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
        return null;
    }
}
