/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//EAD-CW-2  MA-DSE-201F-003 - A.S.I Viraj

package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author VIRAJ
 */
public class tables {
    public static void main(String[] args){
        Connection con=null; 
        Statement st=null;
        try
        {
           con=(Connection) ConnectionProvider.getCon();
           st=con.createStatement();
           st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),staus varchar(20))");
           st.executeUpdate("create table room(roomno varchar(20),roomtype varchar(200),bed varchar(100),price int,status varchar(20))");          
           st.executeUpdate("create table customer(id int,name varchar(200),mobileno int,nationality varchar(100),gender varchar(20),email varchar(100),nic varchar(50),address varchar(300),checkin varchar(30),roomno int,bed varchar(100),roomtype varchar(30),priceperday int,numofdaystay int,totalamount varchar(300),checkout varchar(50))");
                    
            JOptionPane.showMessageDialog(null, "Table created successfuly");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }
}
