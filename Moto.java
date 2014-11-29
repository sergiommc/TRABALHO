/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author 14040201
 */
public class Moto extends Veiculo {
    
    public Moto(int p, int c){
    	super(p, c);
        tarifa = 1.5;
    }
    public Double getCalcularHora(){
        return this.tarifa;
        
    }
    
}
