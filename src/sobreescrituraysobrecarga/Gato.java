
package sobreescrituraysobrecarga;

/**
 * @author Joseph Magallanes
 */
public class Gato extends Animal2 {

    private String nombreGato;
    private double peso;
    private String raza;
    private String sexo;
    
    // heredan de Animal2 -> pero lo implementan a su manera, 
    // sobreescribiendo con @Override
    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro miau miau");
    }

}
