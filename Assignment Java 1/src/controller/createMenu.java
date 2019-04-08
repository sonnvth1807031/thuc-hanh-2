package controller;

import java.util.Scanner;

public class createMenu {
    public void menu(){
        loginMenu loginMenu = new loginMenu();
        registrationMenu registrationMenu = new registrationMenu();
        int choice;
        Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("-----------Menu---------");
           System.out.println("1. Đăng ký");
           System.out.println("2. Đăng nhập");
           System.out.println("3. Thoát");
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.println("dang ki");
                   registrationMenu.registrationMenu();
                   break;
               case 2:
                   System.out.println("dang nhap");
                   loginMenu.loginMenu();
                   break;
               case 3:
                   System.out.println("Thoát");
                   break;
               default:
                   System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
           }
       }while (choice !=3);
        System.out.println("Hẹn gặp lại.");
    }


}
