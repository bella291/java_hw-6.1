package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSalesSum() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.salesSum(allSales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSum(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        int expected = 8; // c указанными в задаче данными, ожидаемый результат может быть 6 или 8, поэтому я уменьшила 6 число массива на 1 единицу для точности теста

        int actual = service.maxSalesMonth(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalesMonth(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSaleMonths() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowerThanAverageSaleMonths(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void higherThanAverageSaleMonths() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.higherThanAverageSaleMonths(allSales);

        assertEquals(expected, actual);
    }
}
