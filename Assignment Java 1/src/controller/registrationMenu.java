package controller;

import java.util.Scanner;
import entity.employees;
import model.EmployeeModel;

public class registrationMenu {
    public void registrationMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên:");
        String name = scanner.nextLine();

        System.out.println("Vui lòng nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Vui lòng nhập email:");
        String email = scanner.nextLine();
        System.out.println("Vui lòng nhập tài khoản:");
        String account = scanner.nextLine();
        System.out.println("Vui lòng nhập mật khẩu:");
        String password = scanner.nextLine();

        // luu thong tin vao database
        if (account.length() != 0 && password.length() != 0){
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.register(name,address,email,account,password);
            System.out.println("dang ki thanh cong");
        }else {
            System.out.println("acc va pass khong duoc de trong");
        }
        // message thong bao login tahnh cong


    }
}
