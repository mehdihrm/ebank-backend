package com.mehdi.ebankbackend.repositories;

import com.mehdi.ebankbackend.entities.BankAccount;
import com.mehdi.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
