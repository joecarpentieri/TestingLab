import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void testForFirstNameGetter(){
//        Given
        BankAccount bankAccount = new BankAccount();
//        When
        String result = bankAccount.getFirstName();
//        Then
        String expected = "Joe";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForFirstNameSetter(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Joe");
        String result = bankAccount.getFirstName();
        String expected = "Joe";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForLastNameGetter(){
        BankAccount bankAccount = new BankAccount();
        String result = bankAccount.getLastName();
        String expected = "Smith";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForLastNameSetter(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setLastName("Smith");
        String result = bankAccount.getLastName();
        String expected = "Smith";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForDateOfBirthGetter(){
        BankAccount bankAccount = new BankAccount();
        String result = bankAccount.getDateOfBirth();
        String expected = "5th Jan 2001";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForDateOfBirthSetter(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setDateOfBirth("5th Jan 2001");
        String result = bankAccount.getDateOfBirth();
        String expected = "5th Jan 2001";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForAccountNumberGetter(){
        BankAccount bankAccount = new BankAccount();
        double result = bankAccount.getAccountNumber();
        double expected = 5473;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForAccountNumberSetter(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(5473);
        double result = bankAccount.getAccountNumber();
        double expected = 5473;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForBalanceGetter(){
        BankAccount bankAccount = new BankAccount();
        double result = bankAccount.getBalance();
        double expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForBalanceSetter(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(0);
        double result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForDeposit(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(0);
        bankAccount.deposit(500);
        double result = bankAccount.getBalance();
        double expected = 500;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForWithdrawal(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdrawal(500);
        double result = bankAccount.getBalance();
        double expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testForInterest(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.payInterest("Savings");
        double result = bankAccount.getBalance();
        double expected = 550;
        assertThat(result).isEqualTo(expected);
    }

//
}
