/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Delia
 */
public class Articulo {

    String Nombre;
    int Codigo;
    float Precio;
    float Cantidad;
    String Unidad;
    
    Articulo  (String Nombre, int Codigo, float Precio, float Cantidad, String Unidad)
    {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio =  Precio;
        this.Cantidad = Cantidad;
        this.Unidad = Unidad;
    }

}
