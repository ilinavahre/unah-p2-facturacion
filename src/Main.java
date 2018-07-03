import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delia
 */
public class Main
{
    public static String padRight (String s, int n)
    {
        if (s.length() >= n)
            return s;

        while (s.length() < n)
            s = s + " ";

        return s;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        PrintStream out = System.out;

        out.print("Nombre de Cliente: ");
        String nombreCliente = in.next();
        
        Factura f = new Factura (nombreCliente);

        out.println("\n-------------------------");
        out.println(">>> Ingrese los detalles de la factura, use cantidad=0 para terminar <<\n");

        while (true)
        {
            out.print("Cantidad: ");
            float cantidad = in.nextFloat();
            if (cantidad <= 0) break;

            out.print("Descripcion: ");
            String desc = in.next();

            out.print("Precio Unitario: " );
            float precio = in.nextFloat();

            f.agregarDetalle(new Detalle(desc, precio, cantidad));
            out.print("\n");
        }

        out.print("\n\n\n");

        out.println("----------------------------------------------------------");
        out.println("Factura #" + ThreadLocalRandom.current().nextInt(101000, 199999));
        out.println("Cliente: " + f.cliente);
        out.println("----------------------------------------------------------");
        out.println("Cantidad      Descripcion       Precio        Sub-Total");
        // 14, 18, 14
        out.println("----------------------------------------------------------");

        for (int i = 0; i < f.numDetalles; i++)
        {
            Detalle d = f.lista[i];
            out.print(padRight(d.cantidad+"", 14));
            out.print(padRight(d.descripcion, 18));
            out.print(padRight("L. "+d.precio, 14));
            out.print("L. " + d.subTotal());
            out.print("\n");
        }

        out.println("----------------------------------------------------------");
        out.println("Sub-Total: L. " + f.subTotal());
        out.println("Impuesto (15%): L. " + f.impuesto());
        out.println("Total: L. " + f.total());
        out.println("----------------------------------------------------------");
        out.println("\n\n");
    }
}
