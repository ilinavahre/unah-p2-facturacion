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
    Articulo articulo;
    float cantidad;

    public Detalle(float cantidad, Articulo a)
    {
        this.cantidad = cantidad;
        this.articulo = a;
    }

    public float subTotal()
    {
        return articulo.Precio*cantidad;
    }

    public float impuesto()
    {
        return 0.15f * subTotal();
    }
}
