package org.example.stragety;

import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;

public class CreateCustomerStrategy implements MenuStrategy{
    @Override
    public void execute() {
        Scanner scanner=new Scanner(System.in);
        Integer customerNo=scanner.nextInt();
        String name=scanner.next();
        String surname=scanner.next();

        Customer customer= new Customer(customerNo,name,surname);
        Bank.customers[Bank.customerLength++]=customer;
    }
}
