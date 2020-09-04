package ru.netology.stats;

public class StatsService{
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

// Метод №1: сумма всех продаж
    public long calculateSum(long[] purchases){
        long sum = 0;
        for (long purchase : purchases){
            sum += purchase;
        }
        return sum;
    }

// Метод №2: средняя сумма продаж в месяц
    public long calculateAverageSum(long[] purchases){
        long sum = calculateSum(purchases);
        long month = 12;
        long average = sum / month;
        return average;
    }

// Метод №3: номер месяца, в котором был пик продаж
    public long findMax(long [] purchases){
        long currentMax = purchases[0];
        long month = 0;
        long monthMax = 1;
        for(long purchase : purchases){
            month++;
            if(currentMax <= purchase){
                currentMax = purchase;
                monthMax = month;}
        }
        return monthMax;
    }

//Метод №4: номер месяца, в котором был минимум продаж
    public long findMin(long[] purchases){
        long currentMin = purchases[0];
        long month = 0;
        long monthMin = 1;
        for(long purchase : purchases){
            month++;
            if(currentMin >= purchase){
                currentMin = purchase;
                monthMin = month;}
        }
        return monthMin;
    }

// метод №5: кол-во месяцев, в которых продажи были ниже среднего
    public long underAverage(long[] purchases){
        long average = calculateAverageSum(purchases);
        long month = 0;
        long underAverage = 0;
        for(long purchase : purchases){
            if (purchase > average) {
                month++;
                underAverage = month;
            }
        }
        return underAverage;
    }

// Метод №6: кол-во месяцев, в которых продажи были выше среднего
    public long overAverage(long[] purchases){
        long average = calculateAverageSum(purchases);
        long month = 0;
        long overAverage = 0;
        for(long purchase : purchases){
            if (purchase < average) {
                month++;
                overAverage = month;
            }
        }
        return overAverage;
    }
}