/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert2_rpl2;

/**
 *
 * @author clara
 */
public class Pert2_rpl2 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Nasi Goreng");
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
    }
}

