/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Fecha: 20/03/2025
 * @author anfeles
 * Objetivo: probar consultas/transacciones en tabla key
 */
public class TestKey {
    public static void main(String[] args) {
        DBKey dbk = new DBKey();
        //insertar
        Key key = new Key(0, "BICENTENARIO AMBIENTE 05", "Sala 205", 3, "Llavero con 3 llaves, color blanco");
        //dbk.insert(key);
        //modificar
        key.setId(5);
        key.setObservation("");
        //dbk.update(key);
        //eliminar
        dbk.delete(5);
        //consultar todos
        List<Key> keys = dbk.findAll();
        for (Key k : keys) {
            System.out.println("id: " + k.getId() + " name: " + k.getName() +" room: " + k.getRoom() +
                                " count: " + k.getCount() + " observation " + k.getObservation());
        }
        
        System.out.println("****************************");
        //consultar por id
        Key key2 = dbk.findById(1);
        System.out.println("id: " + key2.getId() + " name: " + key2.getName() +" room: " + key2.getRoom() +
                                " count: " + key2.getCount() + " observation " + key2.getObservation());
        
    }
}
