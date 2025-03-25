/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBEmployee;
import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.bd.DBRecord;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.model.Record;
import java.util.List;

/**
 * Fecha: 25/03/2025
 * @author anfeles
 * Objetivo: probar consultas/transacciones en tabla record
 */
public class TestRecord {
    public static void main(String[] args) {
        DBRecord dbr = new DBRecord();
        DBEmployee dbe = new DBEmployee();
        DBKey dbk = new DBKey();
        Employee employee = dbe.findById(1115);
        Key key = dbk.findById(2);       
        
        Record record = new Record(0, "2025-03-25", "9:00", "10:000", employee, key, "PENDIENTE");
        
        //dbr.insert(record);
        
        record.setStatus("ENTREGADO");
        record.setId(6);
        //dbr.update(record);
        
        //dbr.delete(6);
        
        List<Record> records = dbr.findAll();
        for (Record r : records) {
            System.out.println("id: "+ r.getId() + " date_record: "+ r.getDateRecord() +
                    " start_time: "+ r.getStartTime()+ " end_time: "+ r.getEndTime() + 
                    " employee: "+ r.getEmployee().getFullname()+ " key: " + r.getKey().getName() +
                    " status: "+r.getStatus());
        }
        
        System.out.println("*********************************");
        
        Record record2 = dbr.findById(1);
        System.out.println("id: "+ record2.getId() + " date_record: "+ record2.getDateRecord() +
                    " start_time: "+ record2.getStartTime()+ " end_time: "+ record2.getEndTime() + 
                    " employee: "+ record2.getEmployee().getFullname()+ " key: " + record2.getKey().getName() +
                    " status: "+record2.getStatus());
        
    }
}
