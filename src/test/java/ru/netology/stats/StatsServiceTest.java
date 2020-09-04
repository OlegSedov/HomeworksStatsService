package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test // Метод №1: сумма всех продаж
    void testCalculateSum() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected,actual);
    }

    @Test // Метод №2: средняя сумма продаж в месяц
    void calculateAverageSum() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSum(purchases);
        assertEquals(expected,actual);
    }

    @Test // Метод №3: номер месяца, в котором был пик продаж
    void findMax() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }

    @Test // Метод №4: номер месяца, в котором был минимум продаж
    void findMin() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMin(purchases);
        assertEquals(expected,actual);
    }

    @Test // Метод №5: кол-во месяцев, в которых продажи были ниже среднего
    void underAverage() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.underAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void overAverage() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.overAverage(purchases);
        assertEquals(expected, actual);
    }
}
