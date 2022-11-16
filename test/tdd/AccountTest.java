 package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

   @Test
   public void depositTest() {
      Account deborahAccount = new Account();
      //when I deposit 5000
      deborahAccount.deposit(5000);

      //check that balance is 5000
      int deborahAccountBalance = deborahAccount.getBalance();
      assertEquals(5000, deborahAccountBalance);
   }

    @Test
   public void depositTwiceTest(){
      //given that is an account
      Account deborahAccount = new Account();
      //given that an initial balance is 4000
       deborahAccount.deposit(4000);
       //when I deposit 2000
       deborahAccount.deposit(2000);
       //check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
       assertEquals(6000, deborahAccountBalance);
   }

   @Test
    public void withdrawalTest() {
       Account deborahAccount = new Account();
       deborahAccount.deposit(6000);
       deborahAccount.withdrawal(2000);
       int deborahAccountBalance = deborahAccount.getBalance();
       assertEquals(4000, deborahAccountBalance);


   }


}