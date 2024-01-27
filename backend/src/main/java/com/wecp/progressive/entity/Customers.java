package com.wecp.progressive.entity;

import java.util.*;

public class Customers /*implements Comparable<Customers>*/{
    private int customer_id;
    private String name;
    private String email;
    private String username;
    private String password;
    private String role;

    public Customers(){
        
    }

    

    public Customers(int customer_id, String name, String email, String username, String password, String role) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }



    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "customer_id=" + customer_id + ", name=" + name + ", email=" + email + ", username="
                + username + ", password=" + password + ", role=" + role + "]";
    }



    /*@Override
    public int compareTo(Customers o) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");

       return this.getName().compareTo(o.getName());
    }*/
        


}