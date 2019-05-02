package accountsconnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;


public class AccountsConnection{

    private Connection c;
    private Statement s;
    private ResultSet r;
    private String q;

    private int accountid;
    private int cardnumber;

    public AccountsConnection(String url, String user, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    public ResultSet queryDatabase(String query){
        try {
            s = c.createStatement();
            r = s.executeQuery(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return r;
    }

    public int getAccountNumber(){
        try {
            r.first();
            return r.getInt("accountid");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public int getOwnerId(){
        try{
            r.first();
            return r.getInt("ownerid");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1; 
    }
    public int getPin(){
        try{
            r.first();
            return r.getInt("pin");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }
    public int getCredit(){
        try{
            r.first();
            return r.getInt("credit");
        }
        catch(Exception e){
           e.printStackTrace();
        }
        return -1;
    }
    public boolean getActive(){
        try{
            r.first();
            int x =  r.getInt("active");
            if(x == 1){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public int getCardnumber(){
        try{
            r.first();
            return r.getInt("cardnumber");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }
    public void updateTable(){
        try{
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


