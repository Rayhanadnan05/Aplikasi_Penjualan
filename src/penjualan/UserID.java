/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

public class UserID {
    private static String userLogin = "";
    private static String idKasir = "";

    public static void setUserLogin(String user) {
        userLogin = user;
    }
    public static String getUserLogin() {
        return userLogin;
    }

    public static void setIdKasir(String id) {
        idKasir = id;
    }
    public static String getIdKasir() {
        return idKasir;
    }
}