/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package local;
import veiculos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author 14040201
 */
public class estacionamento {
    private ArrayList <Moto> listaMotos = new ArrayList <Moto>();
    private ArrayList <Carro> listaCarros = new ArrayList <Carro>();
    private String listaEstacionados;
    public static void main(String Args[]){
    
    Moto moto;
    int p;
    int c;
    
    int opcao = 0;
    while(opcao!=7){
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada"));
        if(opcao == 1){ //cadastrar moto
            p = Integer.parseInt(JOptionPane.showInputDialog("Entre com a placa da moto"));
            
        }
    }
}    
    
    
    
    
    
    
    public void adicionarMoto(int placa, int carteiraMotorista){
        Moto moto = new Moto (placa, carteiraMotorista);
        this.listaMotos.add(moto);
    }
    public void removerMoto(int placa){
        //pesquisar no estacionamento
        //lista vazia
        if(this.listaMotos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro na busca: Nenhuma moto estacionada.");
        }//senão... procurar moto
        else{
            for (int i = 0; i < listaMotos.size(); i++) {
                Moto moto = (Moto) listaMotos.get(i); //Salva o obejto moto inteiro dentro da variavel moto
                int plc = moto.getPlaca(); //pega a placa do objeto moto e salva em plc
            //se encontrar mostre
                if(plc == placa){
                    JOptionPane.showMessageDialog(null,"Moto localizada: "+moto.getPlaca()+"Motorista: "+moto.getCarteiraMotorista());
                    this.listaMotos.remove(i);
                    JOptionPane.showMessageDialog(null, moto.getPlaca()+"Entregue com sucesso");
                }
            }// retorna se não encontrar
            JOptionPane.showMessageDialog(null, "Moto não encontrada");
        }
    }
    public void adicionarCarro(int placa, int carteiraMotorista){
        //pesquisar no estacionamento
        //lista vazia
            Carro carro = new Carro (placa, carteiraMotorista);
            this.listaCarros.add(carro);
    }
    public void removerCarro(int placa){
            if(this.listaCarros.isEmpty()){
                JOptionPane.showMessageDialog(null, "Erro na busca: Nenhum carro estacionado.");             
            }//senão... procurar moto
            else{
                    for (int i = 0; i < listaCarros.size(); i++) {
                         Carro carro = (Carro) listaCarros.get(i);
                         int plc = carro.getPlaca();
                         //se encontrar mostre
                         if(plc == placa){
                         JOptionPane.showMessageDialog(null, "Carro localizado: "+carro.getPlaca()+"Motorista: "+carro.getCarteiraMotorista());
                         this.listaCarros.remove(i);
                         JOptionPane.showMessageDialog(null, carro.getPlaca()+"Entregue com sucesso");
                        }
                }
            }JOptionPane.showMessageDialog(null, "Carro não encontrado");
    }
    public void consultarMoto(int placa){
        if(this.listaMotos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro na busca: Nenhuma moto estacionada.");
        }//senão... procurar moto
        else{
            for (int i = 0; i < listaMotos.size(); i++) {
                Moto moto = (Moto) listaMotos.get(i); //Salva o obejto moto inteiro dentro da variavel moto
                int plc = moto.getPlaca(); //pega a placa do objeto moto e salva em plc
            //se encontrar mostre
                if(plc == placa){
                    JOptionPane.showMessageDialog(null,"Moto localizada: "+moto.getPlaca());
                }
            }
        }
    }
    public void consultarCarro(int placa){
        if(this.listaCarros.isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro na busca: Nenhum carro estacionado.");
        }//senão... procurar moto
        else{
            for (int i = 0; i < listaCarros.size(); i++) {
                Carro carro = (Carro) listaCarros.get(i); //Salva o obejto moto inteiro dentro da variavel moto
                int plc = carro.getPlaca(); //pega a placa do objeto moto e salva em plc
            //se encontrar mostre
                if(plc == placa){
                    JOptionPane.showMessageDialog(null,"Carro localizado: "+carro.getPlaca());
                }
            }
        }
    }
    
    
    
    
    
}
