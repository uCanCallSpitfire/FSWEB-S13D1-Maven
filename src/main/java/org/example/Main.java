package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int hour) {
        if (isBarking && (hour < 8 || hour > 20)) {
            return false;
        } else {
            return true;
        }
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if(isSummer == true && (temp>25 && temp < 45)){return true;
     }else if(isSummer == false && (temp>25 && temp < 35)){
         return true;
     }else { return false;
     }
    }

    public static double area(double width, double height) {
       double result = width*height;
       if(result > 0){return result;
       }else{return -1;}
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;  // negatif değer gelirse -1 döndür
        }
        return radius * radius * Math.PI;
    }
}
