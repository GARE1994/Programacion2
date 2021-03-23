/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.io.FileNotFoundException;
import ni.edu.uni.programacion.backend.dao.implementation.JsonVehicleDaoImpl;
import ni.edu.uni.programacion.backend.pojo.Vehicle;

/**
 *
 * @author Sistemas-12
 */
public class VehiculeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        JsonVehicleDaoImpl jvdao =new JsonVehicleDaoImpl();
        Vehicle v = new Vehicle(1234, 2015,"jeep","Wrangle","viejo", "comodo", "1t12t1t25d55s5s" ,"rojo", "25000", 10000000, Vehicle.Transmission.MANUAL, "3.6 Biturbo", "bueno", "activo");
    }
    
}
