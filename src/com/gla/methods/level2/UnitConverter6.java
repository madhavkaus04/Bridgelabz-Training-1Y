package com.gla.methods.level2;

public class UnitConverter6 {
        public static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        // Celsius to Fahrenheit
        public static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public static double convertPoundsToKg(double pounds) {
            double pounds2kilograms = 0.453592;
            return pounds * pounds2kilograms;
        }

        // Kilograms to Pounds
        public static double convertKgToPounds(double kg) {
            double kilograms2pounds = 2.20462;
            return kg * kilograms2pounds;
        }
        public static double convertGallonsToLiters(double gallons) {
            double gallons2liters = 3.78541;
            return gallons * gallons2liters;
        }
        public static double convertLitersToGallons(double liters) {
            double liters2gallons = 0.264172;
            return liters * liters2gallons;
        }

        public static void main(String[] args) {
            System.out.println("98F to Celsius = " + convertFahrenheitToCelsius(98));
            System.out.println("37C to Fahrenheit = " + convertCelsiusToFahrenheit(37));
            System.out.println("10 Pounds to KG = " + convertPoundsToKg(10));
            System.out.println("5 KG to Pounds = " + convertKgToPounds(5));
            System.out.println("3 Gallons to Liters = " + convertGallonsToLiters(3));
            System.out.println("10 Liters to Gallons = " + convertLitersToGallons(10));
        }
    }
