package com.gla.methods.level2;

public class UnitConverter {

        // Kilometers to Miles
        public static double convertKmToMiles(double km) {
            double km2miles = 0.621371;
            return km * km2miles;
        }

        // Miles to Kilometers
        public static double convertMilesToKm(double miles) {
            double miles2km = 1.60934;
            return miles * miles2km;
        }

        // Meters to Feet
        public static double convertMetersToFeet(double meters) {
            double meters2feet = 3.28084;
            return meters * meters2feet;
        }

        // Feet to Meters
        public static double convertFeetToMeters(double feet) {
            double feet2meters = 0.3048;
            return feet * feet2meters;
        }

        public static void main(String[] args) {
            System.out.println("10 KM to Miles = " + convertKmToMiles(10));
            System.out.println("5 Miles to KM = " + convertMilesToKm(5));
            System.out.println("2 Meters to Feet = " + convertMetersToFeet(2));
            System.out.println("6 Feet to Meters = " + convertFeetToMeters(6));
        }
    }
