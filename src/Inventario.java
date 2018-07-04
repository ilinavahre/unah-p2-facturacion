/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delia
 */
public class Inventario {
   
    private Articulo[] Articulos;
    private int NumArticulos;
    
    public Inventario()
        {
            this.Articulos = new Articulo[1000];
            this.NumArticulos = 0;
        }

    public void Agregar(Articulo a)
        {
            if (NumArticulos >= 1000)
                return;

            Articulos[NumArticulos] = a;            
            NumArticulos++;
        }

    public void ReporteBreve ()
        {
            for (int i = 0; i < NumArticulos; i++)
            {
                System.out.println( Articulos[i].Codigo + " : " + Articulos[i].Nombre );
            }
        }
    public Articulo Buscar(int codigo)
    {
        for(int i =0; i<NumArticulos;i++)
        {
            if(codigo == Articulos[i].Codigo)
                return Articulos[i];
        }
        
        return null;
    }
}



