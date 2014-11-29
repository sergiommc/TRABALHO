package local;

import veiculos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 14040201
 */
public class Estacionamento {
	
	
        private ArrayList<Veiculo> listaCarros = new ArrayList<Veiculo>();
        private ArrayList<Veiculo> listaMotos = new ArrayList<Veiculo>();
	Double diaria = 20.0;
	//inicio do metodo main
	public static void main(String Args[]) {
		
		Estacionamento estacionamento = new Estacionamento();
		
		Moto moto;
		int p;
		int c;
		
		Carro carro;

		int opcao = 0; //menu
		while (opcao != 7) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: \n 1-Cadastrar Moto \n 2- Cadastrar Carro \n 3- Remover moto \n 4- Remover carro \n 5- Consultar Moto \n 6- Consultar Carro \n 7- sair"));
			if (opcao == 1) { // cadastrar moto
				p = Integer.parseInt(JOptionPane.showInputDialog("Entre com a placa da moto"));
				c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da CNH"));
				moto = new Moto(p, c);
				estacionamento.adicionarMoto(moto);
			}
			if(opcao == 2){ //cadastrar carro
				p = Integer.parseInt(JOptionPane.showInputDialog("Entre com a placa do carro"));
				c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da CNH"));
				carro = new Carro(p, c);
				estacionamento.adicionarCarro(carro);
			}
			if(opcao == 3){ //remover moto
				c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da CNH"));
				estacionamento.removerMoto(c);
			}
			if(opcao == 4){//remover carro
				c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da CNH"));
				estacionamento.removerCarro(c);
			}
			if(opcao == 5){//consultar moto
				c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da CNH"));
				estacionamento.consultarMoto(c);	
			}
			if(opcao == 6){//consultar carro
				c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da CNH"));
				estacionamento.consultarCarro(c);
			}
			
			
		
		
		}
	// inicio dos metodos
	}

	public void adicionarMoto(Moto moto) {
		this.listaMotos.add(moto);
	}

	public void removerMoto(int carteiraMotorista) {
                boolean foiLocalizado = false;
		// pesquisar no estacionamento
		// lista vazia
		if (this.listaMotos.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Erro na busca: Nenhuma moto estacionada.");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaMotos.size(); i++) {
				Moto moto = (Moto) listaMotos.get(i); // Salva o obejto moto
														// inteiro dentro da
														// variavel moto
				int cnh = moto.getCarteiraMotorista(); // pega a placa do objeto moto e
											// salva em plc
				// se encontrar mostre
				if (cnh == carteiraMotorista) {
					JOptionPane.showMessageDialog(null, "Moto localizada: " + moto.getPlaca()+ " Motorista: "+ moto.getCarteiraMotorista()+" Valor a ser pago é "+moto.getValorEstacionamento(diaria));
					this.listaMotos.remove(i);
					JOptionPane.showMessageDialog(null, moto.getPlaca()+ " Entregue com sucesso");
                                        foiLocalizado = true;
				}
                                
			}// retorna se não encontrar
                        if(!foiLocalizado)
                                {JOptionPane.showMessageDialog(null, "Moto não encontrada");}
			
		}
	}

	public void adicionarCarro(Carro carro) {
		// pesquisar no estacionamento
		// lista vazia
		this.listaCarros.add(carro);
	}

	public void removerCarro(int carteiraMotorista) {
             boolean foiLocalizado = false;
		if (this.listaCarros.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Erro na busca: Nenhum carro estacionado.");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaCarros.size(); i++) {
				Carro carro = (Carro) listaCarros.get(i);
				int cnh = carro.getCarteiraMotorista();
				// se encontrar mostre
				if (cnh == carteiraMotorista) {
					JOptionPane.showMessageDialog(null, "Carro localizado: " + carro.getPlaca()+ "Motorista: "+ carro.getCarteiraMotorista()+" Valor a ser pago é "+carro.getValorEstacionamento(diaria));
					this.listaCarros.remove(i);
					JOptionPane.showMessageDialog(null, carro.getPlaca()+ " Entregue com sucesso");
                                        foiLocalizado = true;
				}       
			}
                        if(!foiLocalizado){
                                JOptionPane.showMessageDialog(null, "Carro não encontrado");
                                }
		}
		
	}

	public void consultarMoto(int carteiraMotorista) {
                boolean foiLocalizado = false;
		if (this.listaMotos.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Erro na busca: Nenhuma moto estacionada.");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaMotos.size(); i++) {
				Moto moto = (Moto) listaMotos.get(i); // Salva o obejto moto
														// inteiro dentro da
														// variavel moto
				int cnh = moto.getCarteiraMotorista(); // pega a placa do objeto moto e
											// salva em plc
				// se encontrar mostre
				if (cnh == carteiraMotorista) {
					JOptionPane.showMessageDialog(null, "Moto localizada: "
							+ moto.getPlaca());
                                        foiLocalizado = true;
				}
                        }
                        if(!foiLocalizado){
                                JOptionPane.showMessageDialog(null, "Moto não encontrada");
                                }
		}
	}

	public void consultarCarro(int carteiraMotorista) {
             boolean foiLocalizado = false;
		if (this.listaCarros.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Erro na busca: Nenhum carro estacionado.");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaCarros.size(); i++) {
				Carro carro = (Carro) listaCarros.get(i); // Salva o obejto moto
														  // inteiro dentro da
														  // variavel moto
				int cnh = carro.getCarteiraMotorista();   // pega a placa do objeto moto e
											// salva em plc
				// se encontrar mostre
				if (cnh == carteiraMotorista) {
					JOptionPane.showMessageDialog(null, "Carro localizado: "+ carro.getPlaca());
                                        foiLocalizado = true;
				}
                        }
                        if(!foiLocalizado){
                                JOptionPane.showMessageDialog(null, "Carro não encontrado");
                                }
		}
	}
	
}
