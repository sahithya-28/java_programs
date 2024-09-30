package student;

class Converter {
}
class CurrencyConverter extends Converter {
public double dollarToINR(double dollar) {
return dollar * 82.50;
}
public double inrToDollar(double inr) {
return inr / 82.50;
}
public double euroToINR(double euro) {
return euro * 88.00;
}
public double inrToEuro(double inr) {
return inr / 88.00;
}
public double yenToINR(double yen) {
return yen * 0.60;
}
public double inrToYen(double inr) {
return inr / 0.60;
}
}
class DistanceConverter extends Converter {
public double metersToKilometers(double meters) {
return meters / 1000;
}
public double kilometersToMeters(double kilometers) {
return kilometers * 1000;
}
public double milesToKilometers(double miles) {
return miles * 1.60934;
}
public double kilometersToMiles(double kilometers) {
return kilometers / 1.60934;
}
}
class TimeConverter extends Converter {
public int hoursToMinutes(int hours) {
return hours * 60;
}
public int minutesToHours(int minutes) {
return minutes / 60;
}
public int hoursToSeconds(int hours) {
return hours * 3600;
}
public int secondsToHours(int seconds) {
return seconds / 3600;
}
}
class Currency_converter {
public static void main(String[] args) {
CurrencyConverter currencyConverter = new CurrencyConverter();
DistanceConverter distanceConverter = new DistanceConverter();
TimeConverter timeConverter = new TimeConverter();
System.out.println("100 Dollars in INR: " + currencyConverter.dollarToINR(100));
System.out.println("8200 INR in Dollars: " + currencyConverter.inrToDollar(8200));
System.out.println("5000 Meters in Kilometers: " + distanceConverter.metersToKilometers(5000));
System.out.println("3 Miles in Kilometers: " + distanceConverter.milesToKilometers(3));
System.out.println("5 Hours in Minutes: " + timeConverter.hoursToMinutes(5));
System.out.println("7200 Seconds in Hours: " + timeConverter.secondsToHours(7200));
}
}
