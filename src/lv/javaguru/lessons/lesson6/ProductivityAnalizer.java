package lv.javaguru.lessons.lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by olegssedacs on 09/07/2017.
 */
public class ProductivityAnalizer {

    public static final int JANUARY = 0;
    public static final int FEBRUARY = 1;
    public static final int MARCH = 2;
    public static final int APRIL = 3;
    public static final int MAY = 4;
    public static final int JUNE = 5;
    public static final int JULY = 6;
    public static final int AUGUST = 7;
    public static final int SEPTEMBER = 8;
    public static final int OCTOBER = 9;
    public static final int NOVEMBER = 10;
    public static final int DECEMBER = 11;

    public static final int MONTHS = 12;

    public static final int CURRENT_YEAR = 2017;

    public static int minYear = CURRENT_YEAR;

    public static void main(String[] args) throws IOException {
        // замените путь к файлу
        double[][] amounts = readFromFile("/Users/olegssedacs/IdeaProjects/summer_sundays/src/lv/javaguru/lessons/lesson6/amounts.txt");
        initMinYear(amounts);
        while (true) {
            printMenu();
            int userChoice = getIntFromUser();
            switch (userChoice) {
                case 1: {
                    executeAverageByYear(amounts);
                    break;
                }
                case 2: {
                    executeFindMostProductiveMonth(amounts);
                    break;
                }
                case 3:
                    return;
            }
        }
    }

    public static void executeAverageByYear(double[][] amounts) {
        int year = getYearFromUser();
        double average = findAverageByYear(amounts, year);
        System.out.printf("Average in %d is %.2f", year, average);
    }

    public static void executeFindMostProductiveMonth(double[][] amounts) {
        int year = getYearFromUser();
        int month = findMostProductiveMonth(amounts, year);
        String monthName = getMonthName(month);
        System.out.printf("Most productive month in %d is %s", year, monthName);
    }

    public static int getYearFromUser() {
        int year;
        do {
            System.out.print("Input year : ");
            year = getIntFromUser();
        } while (!isYearValid(year));
        return year;
    }

    public static boolean isYearValid(int year) {
        return year <= CURRENT_YEAR && year >= minYear;
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("1. Find average by year");
        System.out.println("2. Find most productive month by year");
        System.out.println("3. Exit");
    }

    public static int getIntFromUser() {
        return new Scanner(System.in).nextInt();
    }

    public static int findMostProductiveMonth(double[][] amounts, int year) {
        int index = convertYearToIndex(year);
        double max = ArrayUtilities.findMax(amounts[index]);
        return ArrayUtilities.findIndexOf(amounts[index], max);
    }

    public static double findAverageByYear(double[][] amounts, int year) {
        int index = convertYearToIndex(year);
        return ArrayUtilities.countAverage(amounts, index);
    }

    /*
    * Пользователь ничего не знает о том, как мы храним данные.
    * Он вводит год 2017 или 2016
    * мы храним в массиве double[year][month]
    * нам нужно вычислить индекс массива относительно текущего года
    * */
    public static int convertYearToIndex(int year) {
        return CURRENT_YEAR - year;
    }

    public static int convertMonthFromUserInput(int input) {
        if (input > MONTHS || input < 1) {
            return 0;
        }
        return --input;
    }

    /*
    * Константы привязаны к индексам массива, значения 0-11
    * Нужно сконвериторавть это значение в понятную для пользователя форму
    * */
    public static String getMonthName(int value) {
        switch (value) {
            case JANUARY:
                return "January";
            case FEBRUARY:
                return "February";
            case MARCH:
                return "March";
            case APRIL:
                return "April";
            case MAY:
                return "May";
            case JUNE:
                return "June";
            case JULY:
                return "July";
            case AUGUST:
                return "August";
            case SEPTEMBER:
                return "September";
            case OCTOBER:
                return "October";
            case NOVEMBER:
                return "November";
            case DECEMBER:
                return "December";
            default:
                return "Not exist";
        }
    }


    public static void initMinYear(double[][] amounts) {
        minYear = CURRENT_YEAR - (amounts.length - 1);
    }

    /*
    * Открываем файл и считываем по-строчно.
    * Сколько строк столько и лет, по-этому ведем счетчик years++
    * В файле все числа записаны через запятую. Мы их разделяем с помощью text.split(",")
    * и получаем массив String[] с числами, запятая при этом автоматически откидывается.
    * Далее мы должны создать массив с числами и записать туда все числа. Чтобы сконвертировать
    * String в double используем метод  Double.parseDouble(string).
    *
    * Этот метод стоит разделить на несколько : чтение из файла, конвертация из String[] в double[][]
    * */
    public static double[][] readFromFile(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bf = new BufferedReader(reader);
        String text = "";
        String line = null;
        int years = 0;
        do {
            line = bf.readLine();
            if (line != null && !line.isEmpty()) {
                years++;
                text += line;
            }
        } while (line != null);
        String[] numbers = text.split(",");
        double[][] amounts = new double[years][MONTHS];
        for (int i = 0, numbersIndex = 0; i < amounts.length; i++) {
            for (int j = 0; j < amounts[i].length; j++, numbersIndex++) {
                amounts[i][j] = Double.parseDouble(numbers[numbersIndex]);
            }
        }
        return amounts;
    }

}
