package ru.netology.stats;
public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSalesAmount(int[] sales) {
        return salesAmount(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int salesBelowAverage(int[] sales) {
        int count = 0;
        double averageSum = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int salesAboveAverage(int[] sales) {
        int count = 0;
        double averageSum = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

}
