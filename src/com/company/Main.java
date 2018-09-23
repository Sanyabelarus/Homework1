package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    exam();


    }
    public static int isNumber(){
        boolean stop = false;
        while (!stop){
        Scanner scanner = new Scanner(System.in);
        boolean rightNum = scanner.hasNextInt();
        if(rightNum){
            stop = true;
            return scanner.nextInt();
        }else {
            System.out.println("Введите число");
            continue;
        }}
        return 0;
    }
    public static int rightHour(int hour) {
        boolean rightHour = false;
        while (!rightHour){
            if(hour>=1 && hour<=24){
                rightHour= true;
                return hour;
            }else {
                System.out.println("Введите правильный час");
                hour=isNumber();
                continue;

            }}
            return 0;
    }
    public static int rightMinute(int minute) {
        boolean rightHour = false;
        while (!rightHour){
            if(minute>=0 && minute<=60){
                rightHour= true;
                return minute;
            }else {
                System.out.println("Введите правильные минуты");
                minute=isNumber();
                continue;

            }}
        return 0;
    }

    public static void exam(){
        int hourCome, minuteCome, hourNeed, minuteNeed;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Во сколько часов пришел студент?");
        hourCome = rightHour(isNumber());
        System.out.println("Во сколько минут пришел студент?");
        minuteCome = rightMinute(isNumber());
        System.out.println("Во сколько часов начинается экзамен?");
        hourNeed = rightHour(isNumber());
        System.out.println("Во сколько минут начинается экзамен?");
        minuteNeed = rightMinute(isNumber());

        if((hourCome*60+minuteCome)>(hourNeed*60+minuteNeed)){
            int wasLateHour = ((hourCome*60+minuteCome)-(hourNeed*60+minuteNeed))/60;
            int wasLateMin = ((hourCome*60+minuteCome)-(hourNeed*60+minuteNeed))%60;
            System.out.println("Студент оопоздал на " + wasLateHour + " часов и " + wasLateMin + " минут");
        }else if ((hourCome*60+minuteCome+29)<(hourNeed*60+minuteNeed)) {
            int earlyHour= ((hourNeed*60+minuteNeed)-(hourCome*60+minuteCome))/60;
            int earlyMin = ((hourNeed*60+minuteNeed)-(hourCome*60+minuteCome))%60;
            System.out.println("Студент пришел ранmьше на " + earlyHour + " часов и " + earlyMin + " минут");
        }else {
            System.out.println("Студент пришел вовремя");
        }


    }
}
