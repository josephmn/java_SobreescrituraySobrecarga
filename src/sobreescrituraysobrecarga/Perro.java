
package sobreescrituraysobrecarga;

/**
 * @author Joseph Magallanes
 */
public class Perro extends Animal2 {

    private String nombrePerro;
    private double peso;
    private String raza;
    private String sexo;
    
    //constructores
    
    //métodos getters y setters
    
    // heredan de Animal2 -> pero lo implementan a su manera, 
    // sobreescribiendo con @Override
    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro Guau guau");
    }

}
