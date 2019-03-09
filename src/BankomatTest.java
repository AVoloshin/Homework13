import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class BankomatTest {
    private Bankomat bank;

    @Before
    public void init() {
        bank = new Bankomat(0, 0, 0);
    }

    @Test
    public void countNumTest() {
        assertArrayEquals(bank.countNum(100), new int[]{0, 0, 1});
    }

    @Test
    public void countNumTest2() {
        assertArrayEquals(bank.countNum(110), new int[]{3, 1, 0});
    }
    @Test
    public void countNumTest3() {
        assertArrayEquals(bank.countNum(1000), new int[]{0, 0, 9});
    }
    @Test
    public void outputMoneyTest() {
        bank.outputMoney(100);
        assertEquals(bank.num_100==1, bank.num_100==1);
    }
    @Test
    public void outputMoneyTest2() {
        bank.outputMoney(1000);
        assertEquals(bank.num_100==10, bank.num_100==9);
    }
    @Test
    public void outputMoneyTest3() {
        bank.outputMoney(1020);
        assertEquals(bank.num_20==1, bank.num_20==1);
    }
    @Test
    public void inputMoneyTest() {
        bank.inputMoney(1020);
        assertEquals(bank.num_50==0, bank.num_50==0);
    }
    @Test
    public void inputMoneyTest2() {
        bank.inputMoney(50);
        assertEquals(bank.num_50==1, bank.num_50==1);
    }
    @Test
    public void inputMoneyTest3() {
        bank.inputMoney(110);
        assertEquals(bank.num_20==3, bank.num_20==0);
    }

}