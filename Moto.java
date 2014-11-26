/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author 14040201
 */
public class Moto {
    protected int placa;
    protected int carteiraMotorista;
    
    public Moto(int p, int c){
        setPlaca(p);
        setCarteiraMotorista(c);
    }
    public void setPlaca(int p){
        this.placa=p;
    }
    public int getPlaca(){
        return this.placa;
    }
    public void setCarteiraMotorista(int c){
        this.carteiraMotorista = c;
    }
    public int getCarteiraMotorista(){
        return this.carteiraMotorista;
    }
    
}
