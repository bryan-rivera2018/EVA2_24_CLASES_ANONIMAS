/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_24_clases_anonimas;

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class EVA2_24_CLASES_ANONIMAS implements ImprimirMensaje{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EVA2_24_CLASES_ANONIMAS mObj = new EVA2_24_CLASES_ANONIMAS();
        mObj.ImprimeMensaje("BRYAN");
        //Imprimir Mensaje es una interfaz. No se pueden crear objetos de interfaces.
        //crear una clase anonima que implementa los metodos de la interfaz.
        //se usa para eventos y para hilos
        ImprimirMensaje objImprimir = new ImprimirMensaje() {
            @Override
            public void ImprimeMensaje(String sMens) {
                System.out.println("Hola " + sMens);
            }
        };
        objImprimir.ImprimeMensaje("Oconer");
    }

    @Override
    public void ImprimeMensaje(String sMens) {
        System.out.println("Hola "+ sMens);
    }
    
}
interface ImprimirMensaje{
    public void ImprimeMensaje(String sMens);
    
}