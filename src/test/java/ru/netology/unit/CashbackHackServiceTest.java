package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void ShouldReturn100InAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expect = 100;

        assertEquals(expect,actual);
    }

    @Test
    void ShouldReturn0InAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expect = 0;

        assertEquals(expect,actual);
    }

    @Test
    void ShouldReturn1000InAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expect = 1000;

        assertEquals(expect,actual);
    }
}