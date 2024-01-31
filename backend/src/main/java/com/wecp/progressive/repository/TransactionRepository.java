package com.wecp.progressive.repository;

import java.util.List;

import javax.transaction.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Transactions;
@Repository
public interface TransactionRepository extends JpaRepository<Transactions,Integer> {
     public List<Transactions> findByCustomerId(int customerId);
}