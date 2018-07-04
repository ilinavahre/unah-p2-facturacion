/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delia
 */
public class Factura
{
    public String cliente;

    public Detalle[] lista;
    public int numDetalles;

    public Factura (String cliente)
    {
        this.cliente = cliente;

        this.lista = new Detalle[100];
        this.numDetalles = 0;
    }

    public Boolean agregarDetalle (Detalle l)
    {
        if(numDetalles >= 100)
            return false;

        this.lista[this.numDetalles] = l;
        this.numDetalles++;

        return true;
    }

    public float subTotal ()
    {
        float valor = 0;
        
        for (int i = 0; i < numDetalles; i++)
        {
            valor += lista[i].subTotal();
        }

        return valor;
    }
    public float impuesto () 
    {
        float valor = 0;
        
        for (int i = 0; i < numDetalles; i++)
        {
            valor += lista[i].impuesto();
        }
        
        return valor;
    }

    public float total ()
    {
        return subTotal() + impuesto();
    }
}
