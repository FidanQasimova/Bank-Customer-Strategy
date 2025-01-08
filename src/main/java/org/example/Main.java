package org.example;

import org.example.enums.MenuEnum;
import org.example.model.Bank;
import org.example.util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuUtil.showMenuItems();
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        MenuEnum menu=MenuEnum.getEnumByValue(option);
        menu.getStrategy().execute();



    }
}