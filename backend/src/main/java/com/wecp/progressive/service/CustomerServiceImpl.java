package com.wecp.progressive.service;

import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;

import java.sql.SQLException;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {

    private static List<Customers> listOfCustomer = new ArrayList<>();

    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return null;
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return null;
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return -1;
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {

    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {

    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        return null;
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return listOfCustomer;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        listOfCustomer.add(customers);
        return listOfCustomer;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList(){
        List<Customers> sortedCustomers = listOfCustomer;
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void emptyArrayList() {
        listOfCustomer = new ArrayList<>();
    }
}