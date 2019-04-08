package main;
import controller.createMenu;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {

    public static void main(String[] args) {
    createMenu createMenu = new createMenu();
    createMenu.menu();
    }
}
