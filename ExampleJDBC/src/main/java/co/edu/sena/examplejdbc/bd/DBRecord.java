/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.bd;

import static co.edu.sena.examplejdbc.bd.DBConnection.connection;
import static co.edu.sena.examplejdbc.bd.DBConnection.statement;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.model.Record;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 25/03/2025
 * @author anfeles
 * Objetivo: permite consultas y transacciones en la tabla record
 */
public class DBRecord extends DBConnection {
    public void insert(Record record){
        try {
            connect();
            String sql = "INSERT INTO `record` (`date_record`, `start_time`, `end_time`, `employee_id`, `key_id`, `status`) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int position=0;
            preparedStatement.setString(++position, record.getDateRecord());
            preparedStatement.setString(++position, record.getStartTime());
            preparedStatement.setString(++position, record.getEndTime());
            preparedStatement.setLong(++position, record.getEmployee().getDocument());  //FK
            preparedStatement.setInt(++position, record.getKey().getId());    //FK
            preparedStatement.setString(++position, record.getStatus()); 
            preparedStatement.executeUpdate();
            preparedStatement.close();            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al insertar registro " + e.getMessage());      
        }
        finally{
            disconnect();
        }
    }
    
    public void update(Record record){
        try {
            connect();
            String sql = "UPDATE `record` SET `date_record`=?, `start_time`=?, `end_time`=?, `employee_id`=?, `key_id`=?, `status`=? WHERE `id`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int position=0;
            preparedStatement.setString(++position, record.getDateRecord());
            preparedStatement.setString(++position, record.getStartTime());
            preparedStatement.setString(++position, record.getEndTime());
            preparedStatement.setLong(++position, record.getEmployee().getDocument());  //FK
            preparedStatement.setInt(++position, record.getKey().getId());    //FK
            preparedStatement.setString(++position, record.getStatus()); 
            preparedStatement.setInt(++position, record.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al actualizar registro " + e.getMessage());      
        }
        finally{
            disconnect();
        }
    }
    
    public void delete(int id){
        try {
            connect();
            String sql = "delete from record where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al eliminar registro " + e.getMessage());      
        }
        finally{
            disconnect();
        }
    }
    
    public List<Record> findAll()
    {
        List<Record> results = new ArrayList<>();
        DBEmployee dbet = new DBEmployee();
        DBKey dbk = new DBKey();
        try {
            connect();
            String sql = "select * from record";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                Record record = new Record();
                record.setId(resultSet.getInt("id"));
                record.setDateRecord(resultSet.getString("date_record"));
                record.setStartTime(resultSet.getString("start_time"));
                record.setEndTime(resultSet.getString("end_time"));
                record.setStatus(resultSet.getString("status"));
                //FK
                Employee employee = dbet.findById(resultSet.getLong("employee_id"));
                record.setEmployee(employee);
                Key key = dbk.findById(resultSet.getInt("key_id"));
                record.setKey(key);
                
                results.add(record);
            }
            resultSet.close();
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar registros " + e.getMessage());     
        }
        finally{
            disconnect();
        }
        
        return results;
    }
    
    public Record findById(int id)
    {
        Record record = null;
        DBEmployee dbet = new DBEmployee();
        DBKey dbk = new DBKey();
        try {
            connect();
            String sql = "select * from record where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next())
            {
                record = new Record();
                record.setId(resultSet.getInt("id"));
                record.setDateRecord(resultSet.getString("date_record"));
                record.setStartTime(resultSet.getString("start_time"));
                record.setEndTime(resultSet.getString("end_time"));
                record.setStatus(resultSet.getString("status"));
                //FK
                Employee employee = dbet.findById(resultSet.getLong("employee_id"));
                record.setEmployee(employee);
                Key key = dbk.findById(resultSet.getInt("key_id"));
                record.setKey(key);
            }
            
            resultSet.close();
            preparedStatement.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar registro " + e.getMessage());      
        }
        finally{
            disconnect();
        }
        
        return record;
    }
}
