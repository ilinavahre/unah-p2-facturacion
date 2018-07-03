/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delia
 */
public class Detalle
{
    String descripcion;
    float precio;
    float cantidad;

    public Detalle(String desc, float precio, float cantidad)
    {
        this.descripcion = desc;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public float subTotal()
    {
        return precio*cantidad;
    }

    public float impuesto()
    {
        return 0.15f * subTotal();
    }
}
