package controller;

import java.util.Scanner;
import model.EmployeeModel;

public class loginMenu {
    public void loginMenu(){

        // Lấy dữ liệu nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tài khoản");
//        scanner.nextLine();
        String account = scanner.nextLine();
        System.out.println("Mật khẩu");
//        scanner.nextLine();
        String pass = scanner.nextLine();

        //Kiểm tra acc và pass có đúng không
        if (account.length() != 0 && pass.length() != 0) {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.checkExistAccountAndPass(account,pass);

            if (employeeModel.checkExistAccountAndPass(account, pass) == true ) {
                System.out.println("dang nhap thanh cong");
                // ptint thong tin user
                employeeModel.getProfileUser(account);

            } else {
                System.out.println("acc hoac pass khong dung");
            }
        } else {
            System.out.println("acc va pass la bat buoc");
        }



    }
}
