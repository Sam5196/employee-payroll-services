package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    private static List<EmployeePayRoll> empPayRollList;
    private static Scanner sc = new Scanner(System.in);

    public EmployeePayRollService(List<EmployeePayRoll> empPayRollList) {
        EmployeePayRollService.empPayRollList = empPayRollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayRoll> empPayRollList = new ArrayList<EmployeePayRoll>();
        EmployeePayRollService empPayRollService = new EmployeePayRollService(empPayRollList);

        EmployeePayRollService.readData();

        empPayRollService.writeData();

    }

    private static void readData() {
        System.out.println("Please Enter the following details :");
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name :");
        String name = sc.nextLine();
        System.out.println("Enter Salary :");
        double salary = sc.nextDouble();

        EmployeePayRoll empPayRollObject = new EmployeePayRoll(id, name, salary);
        empPayRollList.add(empPayRollObject);
    }

    private void writeData() {
        System.out.println("Employee Pay Roll Data : \n" + empPayRollList.get(0).toString());
    }

}