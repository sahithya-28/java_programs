package student;

import java.util.Scanner;
class ElectricityBill {
int consumerNo;
String consumerName;
double previousMonthReading;
double currentMonthReading;
String connectionType;
public ElectricityBill(int consumerNo, String consumerName, double previousMonthReading, double currentMonthReading, String connectionType) {
this.consumerNo = consumerNo;
this.consumerName = consumerName;
this.previousMonthReading = previousMonthReading;
this.currentMonthReading = currentMonthReading;
this.connectionType = connectionType.toLowerCase();
}
public double calculateBillAmount() {
double unitsConsumed = currentMonthReading - previousMonthReading;
double billAmount = 0;
if (connectionType.equals("domestic")) {
if (unitsConsumed <= 100) {
billAmount = unitsConsumed * 1.50;
} else if (unitsConsumed <= 200) {
billAmount = (100 * 1.50) + (unitsConsumed - 100) * 2.50;
} else if (unitsConsumed <= 500) {
billAmount = (100 * 1.50) + (100 * 2.50) + (unitsConsumed - 200) * 4.00;
} else {
billAmount = (100 * 1.50) + (100 * 2.50) + (300 * 4.00) + (unitsConsumed - 500) * 6.00;
}
} else if (connectionType.equals("commercial")) {
if (unitsConsumed <= 100) {
billAmount = unitsConsumed * 2.00;
} else if (unitsConsumed <= 200) {
billAmount = (100 * 2.00) + (unitsConsumed - 100) * 4.50;
} else if (unitsConsumed <= 500) {
billAmount = (100 * 2.00) + (100 * 4.50) + (unitsConsumed - 200) * 6.00;
} else {
billAmount = (100 * 2.00) + (100 * 4.50) + (300 * 6.00) + (unitsConsumed - 500) * 7.00;
}
} else {
System.out.println("Invalid connection type");
}
return billAmount;
}
public void displayBill() {
System.out.println("Electricity Bill");
System.out.println("Consumer No: " + consumerNo);
System.out.println("Consumer Name: " + consumerName);
System.out.println("Previous Month Reading: " + previousMonthReading);
System.out.println("Current Month Reading: " + currentMonthReading);
System.out.println("Connection Type: " + connectionType);
System.out.println("Total Units Consumed: " + (currentMonthReading - previousMonthReading));
System.out.println("Bill Amount: Rs. " + calculateBillAmount());
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Consumer Number: ");
int consumerNo = scanner.nextInt();
scanner.nextLine();
System.out.print("Enter Consumer Name: ");
String consumerName = scanner.nextLine();
System.out.print("Enter Previous Month Reading: ");
double previousMonthReading = scanner.nextDouble();
System.out.print("Enter Current Month Reading: ");
double currentMonthReading = scanner.nextDouble();
scanner.nextLine();
System.out.print("Enter Connection Type (domestic/commercial): ");
String connectionType = scanner.nextLine();
ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading, currentMonthReading, connectionType);
bill.displayBill();
scanner.close();
}
}