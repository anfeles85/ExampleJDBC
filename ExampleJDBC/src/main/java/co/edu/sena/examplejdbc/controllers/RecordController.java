/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBRecord;
import co.edu.sena.examplejdbc.model.Record;
import java.util.List;

/**
 * Fecha: 25/03/2025
 * @author anfeles
 * Objetivo: implementar la interface para controlar el modelo Record
 */
public class RecordController implements IRecordController {

    private DBRecord dbr = new DBRecord();    
    
    @Override
    public void insert(Record record) throws Exception {
        if(record == null)
        {
            throw new Exception("El registro es nulo");
        } 
        
        if("".equals(record.getDateRecord()))
        {            
            throw new Exception("La fecha es obligatoria");
        }
        
        if("".equals(record.getStartTime()))
        {            
            throw new Exception("La hora de inicio es obligatoria");
        }
        
        if(record.getEmployee() == null)
        {
            throw new Exception("El empleado es obligatorio");
        }
        
        if(record.getKey() == null)
        {
            throw new Exception("La llave es obligatoria");
        }
        
        if("".equals(record.getStatus()))
        {            
            throw new Exception("El estado es obligatorio");
        }
               
        dbr.insert(record);
    }

    @Override
    public void update(Record record) throws Exception {
        if(record == null)
        {
            throw new Exception("El registro es nulo");
        } 
        
        if(record.getId() == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        if("".equals(record.getDateRecord()))
        {            
            throw new Exception("La fecha es obligatoria");
        }
        
        if("".equals(record.getStartTime()))
        {            
            throw new Exception("La hora de inicio es obligatoria");
        }
        
        if(record.getEmployee() == null)
        {
            throw new Exception("El empleado es obligatorio");
        }
        
        if(record.getKey() == null)
        {
            throw new Exception("La llave es obligatoria");
        }
        
        if("".equals(record.getStatus()))
        {            
            throw new Exception("El estado es obligatorio");
        }
        
        Record recordExists = dbr.findById(record.getId());
        if(recordExists == null)
        {
            throw new Exception("No existe el registro");
        }
               
        dbr.update(record);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        Record recordExists = dbr.findById(id);
        if(recordExists == null)
        {
            throw new Exception("No existe el registro");
        }
               
        dbr.delete(id);
    }

    @Override
    public List<Record> findAll() throws Exception {
        return dbr.findAll();
    }

    @Override
    public Record findById(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        return dbr.findById(id);
    }
    
}
