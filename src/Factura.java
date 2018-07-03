/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Delia
 */
public class Factura
{
    String cliente;
    ArrayList<Detalle> lista;

    public Factura (String cliente)
    {
        this.cliente = cliente;
        this.lista = new ArrayList<Detalle> ();
    }

    public void agregarDetalle (Detalle l)
    {
        this.lista.add(l);
    }

    public float subTotal ()
    {
        float valor = 0;
        
        for (int i = 0; i < lista.size(); i++)
        {
            valor += lista.get(i).subTotal();
        }

        return valor;
    }

    public float impuesto ()
    {
        float valor = 0;
        
        for (int i = 0; i < lista.size(); i++)
        {
            valor += lista.get(i).impuesto();
        }
        
        return valor;
    }

    public float total ()
    {
        return subTotal() + impuesto();
    }
}
