package tdd;

import org.junit.jupiter.api.Test;

public class kamtoroAccountTest {

    @Test
    public void deposit2Test(){
        Account kamtoroAccount = new Account();
        kamtoroAccount.deposit(4000);
        int kamtoroAccountBalance = kamtoroAccount.getBalance();
    }
}
