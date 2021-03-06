package ru.netology.stats;

public class StatsService {

    /// сумма всех продаж
    public int calculateSum(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }
        return sum;

    }


    /// средняя сумма продаж

    public int averageSales(int[] values) {
//        int avgSales = 0;
        int month = 12;


//        for (int value : values) {
//            month = month + 1;
            int avgSales = calculateSum(values) / month;
//        }
        return avgSales;

    }

    ///месяц максимальных продаж
    public int maxSalesOfMonth(int[] values) {
        int currentMax = values[0];
        int month = 0;
        int maxSaleMonth = 0;


        for (int value : values) {
            month += 1;
            if (currentMax <= value) {
                currentMax = value;
                maxSaleMonth = month;

            }

        }
        return maxSaleMonth;

    }

    /// месяц минимальных продаж
    public int minSaleMonth(int[] values) {
        int currentMax = values[0];
        int month = 0;
        int minSaleMonth = 0;
        for (int value : values) {
            month += 1;

            if (currentMax >= value) {
                currentMax = value;
                minSaleMonth = month;
            }
        }

        return minSaleMonth;
    }
///месяцы с продажами ниже среднего
    public int monthLowSales(int[] values) {

        int monthLSel = 0;
        int avgSales = averageSales(values);

        for (int value : values) {
            if (value < avgSales) {
                monthLSel += 1;
            }
        }
        return monthLSel;
    }

    /// месяцы с продажами выше среднего
    public int monthHightSales(int[] values) {
        int monthHSel = 0;
        int avgSales = averageSales(values);

        for (int value : values) {
            if (value > avgSales) {
                monthHSel += 1;
            }
        }
        return monthHSel;
    }


}




