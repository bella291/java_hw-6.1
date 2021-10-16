package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {    // сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {   // средняя сумма продаж за месяц
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public int maxSalesMonth(int[] sales) {   // номер месяца, где был пик продаж
        int upSaleMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[upSaleMonth]) {
                upSaleMonth = month;
            }
            month = month + 1;
        }
        return upSaleMonth + 1;
    }

    public int minSalesMonth(int[] sales) {   // номер месяца, где были низкие продажи
        int lowSaleMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[lowSaleMonth]) {
                lowSaleMonth = month;
            }
            month = month + 1;
        }
        return lowSaleMonth + 1;
    }

    public int lowerThanAverageSaleMonths(int[] sales) {   // средняя сумма продаж за месяц
        int averageSaleMonth = averageSum(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < averageSaleMonth)
                month = month + 1;
        }
        return month;
    }

    public int higherThanAverageSaleMonths(int[] sales) {   // средняя сумма продаж за месяц
        int averageSaleMonth = averageSum(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > averageSaleMonth)
                month = month + 1;
        }
        return month;
    }
}
