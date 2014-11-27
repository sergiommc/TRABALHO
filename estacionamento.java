package local;

import veiculos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 14040201
 */
public class Estacionamento {
	private ArrayList<Moto> listaMotos = new ArrayList<Moto>();
	private ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	private ArrayList<Veiculo> Veiculos = new ArrayList<Veiculo>();
	private String listaEstacionados;
	//inicio do metodo main
	public static void main(String Args[]) {
		
		Estacionamento estacionamento = new Estacionamento();
		
		Moto moto;
		int p;
		int c;
		
		Carro carro;
		String modelo;

		int opcao = 0; //menu
		while (opcao != 8) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: \n 1-Cadastrar Moto \n 2- Cadastrar Carro \n 3- Remover moto \n 4- Remover carro \n 5- Consultar Moto \n 6- Consultar Carro \n 7- Listar todos os Veiculos \n 8- sair"));
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
			if(opcao == 7){//listar veiculos
				estacionamento.getListaEstacionados();
			}
			
		
		
		}
	// inicio dos metodos
	}

	public void adicionarMoto(Moto moto) {
		this.listaMotos.add(moto);
	}

	public void removerMoto(int carteiraMotorista) {
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
					JOptionPane.showMessageDialog(
							null,
							"Moto localizada: " + moto.getPlaca()
									+ "Motorista: "
									+ moto.getCarteiraMotorista());
					this.listaMotos.remove(i);
					JOptionPane.showMessageDialog(null, moto.getPlaca()
							+ "Entregue com sucesso");
				}
			}// retorna se não encontrar
			JOptionPane.showMessageDialog(null, "Moto não encontrada");
		}
	}

	public void adicionarCarro(Carro carro) {
		// pesquisar no estacionamento
		// lista vazia
		this.listaCarros.add(carro);
	}

	public void removerCarro(int carteiraMotorista) {
		if (this.listaCarros.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Erro na busca: Nenhum carro estacionado.");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaCarros.size(); i++) {
				Carro carro = (Carro) listaCarros.get(i);
				int cnh = carro.getCarteiraMotorista();
				// se encontrar mostre
				if (cnh == carteiraMotorista) {
					JOptionPane.showMessageDialog(
							null,
							"Carro localizado: " + carro.getPlaca()
									+ "Motorista: "
									+ carro.getCarteiraMotorista());
					this.listaCarros.remove(i);
					JOptionPane.showMessageDialog(null, carro.getPlaca()
							+ "Entregue com sucesso");
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Carro não encontrado");
	}

	public void consultarMoto(int carteiraMotorista) {
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
				}
			}
		}
	}

	public void consultarCarro(int carteiraMotorista) {
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
					JOptionPane.showMessageDialog(null, "Carro localizado: "
							+ carro.getPlaca());
				}
			}
		}
	}
	public String getListaEstacionados(){
		this.Veiculos.addAll(listaMotos);
		this.Veiculos.addAll(listaCarros);
		if(Veiculos.isEmpty()){
			return "Não há nenhum carro ou moto estacionado";
		}
		else{
			for (int i = 0; i < Veiculos.size(); i++) {
				listaEstacionados = listaEstacionados + Veiculos.get(i).getPlaca() + "\n";
			}
		}return listaEstacionados;
	}
}
