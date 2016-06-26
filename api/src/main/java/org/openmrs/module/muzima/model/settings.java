/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dannex Daniels
 */
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Set;
package org.openmrs.module.muzima.model;
public class Settings extends AuditableData{
    
    private ErrorData edited_Obs_Approval = new (final AuditableData data);
    //these variables to get data from the observation
    String msg;
        
    Date dateprocessed;
        
    Set<ErrorMessage> messages;
    
    public static void main(String[] args) {  
        
        if(isApproved()){
            //Send all Edited Obs to the error queue (Better to a new queue named Edited Obs Approval)   
            edited_Obs_Approval.setMessage(msg);
            edited_Obs_Approval.setDateProcessed(dateprocessed);
            edited_Obs_Approval.setErrorMessages(messages);
        }else {
            //Invoke the handler to process data with Json-obs-update discriminator
        }
       
        
    }
    public Boolean isApproved(){
            try{
                Boolean data;
                Connection connection = DriverManager.getConnection("173.255.205.23:8081","admin","test");
                java.sql.Statement statement = connection.createStatement();
                String sql = "SELECT approved? FROM muzima_edit_approval WHERE id = 1 ";
                ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){
                    data = rs.getBoolean("approved?");
                }
            }catch(SQLException exc){
                System.out.print(exc.getMessage());
            } 
            return data;
    }
    
}
