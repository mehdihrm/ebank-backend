package com.mehdi.ebankbackend.services;

import com.mehdi.ebankbackend.entities.BankAccount;
import com.mehdi.ebankbackend.entities.CurrentAccount;
import com.mehdi.ebankbackend.entities.SavingAccount;
import com.mehdi.ebankbackend.repositories.BankAccountRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Transactional
@Service @AllArgsConstructor
public class BankService {
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount=
                bankAccountRepository.findById("0b36be78-8d5d-446b-9f20-37eadc9d3c3b").orElse(null);
        if(bankAccount!=null) {
            System.out.println("*****************************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println("Over Draft=>" + ((CurrentAccount) bankAccount).getOverDraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.println("Rate=>" + ((SavingAccount) bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperations().forEach(op -> {
                System.out.println(op.getType() + "\t" + op.getOperationDate() + "\t" + op.getAmount());
            });
        }
    }
}
