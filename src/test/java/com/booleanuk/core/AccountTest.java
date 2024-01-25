package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testCreatingAccountAndDeposit(){
        Account account = new SavingsAccount();
        Assertions.assertTrue(account.deposit(1000));

    }
}