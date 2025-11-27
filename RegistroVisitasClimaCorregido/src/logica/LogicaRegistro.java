    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanma
 */
public class LogicaRegistro {
    
    private static final List<Registro> ListaRegistros = new ArrayList<>();
    
    public static void añadirRegistro(Registro r) { 
        ListaRegistros.add(r);
    }
    
    public static List<Registro> getRegistro() {
    return new ArrayList<>(ListaRegistros);
    }
    
    public static List<Registro> getRegistrosDirecto() {
    return ListaRegistros; // acceder a la lista real
    }
    
    // Método para eliminar un registro por ciudad
    public static boolean eliminarRegistroPorCiudad(String ciudad) {
        for (int i = 0; i < ListaRegistros.size(); i++) {
        Registro r = ListaRegistros.get(i);
        if (r.getCiudad().equalsIgnoreCase(ciudad)) {
        ListaRegistros.remove(i);
        return true;
        }
    }
    return false;
    }
}
