/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsconnection;

/**
 *
 * @author Jarno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user;
        String pincode;
        user = "1";
        AccountsConnection a = new AccountsConnection("jdbc:mysql://localhost:8306/mybank?useLegacyDatetimeCode=false&serverTimezone=Europe/Amsterdam", "bank", "hunter2");
        AccountsConnection b = new AccountsConnection("jdbc:mysql://localhost:8306/mybank?useLegacyDatetimeCode=false&serverTimezone=Europe/Amsterdam", "bank", "hunter2");

        a.queryDatabase("SELECT * FROM accounts WHERE accountid =" +user);
        b.queryDatabase("UPDATE table SET transactionid  ");
        System.out.println(a.getAccountNumber());
        System.out.println(a.getPin());
    
    }
    
}
