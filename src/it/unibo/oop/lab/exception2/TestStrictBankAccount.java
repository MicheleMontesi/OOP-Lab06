package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         */
    	BankAccount acc1 = new StrictBankAccount(1, 1000, 2);
    	BankAccount acc2 = new StrictBankAccount(2, 0, 5);
    	
        /* 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	acc1.withdrawFromATM(1, 500);
    	acc1.withdrawFromATM(1, 300);
    	acc1.deposit(1, 100);
    	acc1.withdraw(1, 100);
    	acc2.depositFromATM(2, 100);
    }
}
