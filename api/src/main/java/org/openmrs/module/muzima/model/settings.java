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
    
    public static final Boolean EDIT_APPROVED = "settings";
    private ErrorData edited_Obs_Approval = new (final AuditableData data);
    //these variables to get data from the observation
    String msg;
        
    Date dateprocessed;
        
    Set<ErrorMessage> messages;
    
    public static void main(String[] args) {  
        
        if(EDIT_APPROVED==true){
            //Send all Edited Obs to the error queue (Better to a new queue named Edited Obs Approval)   
            edited_Obs_Approval.setMessage(msg);
            edited_Obs_Approval.setDateProcessed(dateprocessed);
            edited_Obs_Approval.setErrorMessages(messages);
        }else {
            //Invoke the handler to process data with Json-obs-update discriminator
        }
       
        
    }
        
}
