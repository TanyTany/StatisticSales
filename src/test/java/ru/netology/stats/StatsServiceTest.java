package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(values);

        System.out.println(sum);
    }

    @Test
    void shouldAverageSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSales(values);
        int expected = 15;
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void shoulMaxSalesOfMonth() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSalesOfMonth(values);
        int expected = 8;
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void shoulMinSalesOfMonth() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSaleMonth(values);
        int expected = 9;
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void ahouldMonthLowSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthLowSales(values);
        int expected = 5;
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void ahouldMonthHightSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthHightSales(values);
        int expected = 5;
        System.out.println(actual);
        assertEquals(expected, actual);

    }



}