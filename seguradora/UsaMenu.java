package br.unipe.java.seguradora;

import java.util.Scanner;

public class UsaMenu {
	public static void main(String[] args) {
						
		MenuPrincipal menu = new MenuPrincipal();
		int opcao;
		Scanner leitor = new Scanner(System.in);
		ImovelResidencial[] clientePf = new ImovelResidencial[10000];//Array que guarda todas as pessoas fisicas
		int clienteIndexresidencial = 0;
		ImovelEmpresarial[] clientePj = new ImovelEmpresarial[10000];
		int clienteIndexempresarial = 0;
		
		do
		{
			opcao = menu.exibeMenu();
			
			switch(opcao)
			{
				case 1: UsaCliente cliente = new UsaCliente();
						int clienteTipo = cliente.tipoCliente();
						
						if(clienteTipo == 1)
						{			
							PessoaFisica perfilPf = new PessoaFisica();
							ImovelResidencial pessoaFisica = new ImovelResidencial();
							
							System.out.print("Digite seu nome: ");
							perfilPf.setNome(leitor.nextLine());
							System.out.print("Digite sua idade: ");
							perfilPf.setIdade(leitor.nextByte());		
							System.out.print("Digite um telefone: ");
							perfilPf.setTelefone(leitor.nextLong());		
							System.out.print("Digite seu CPF: ");
							perfilPf.setCPF(leitor.nextLong());
							System.out.print("Qual a zona do imovel (Urbana/Rural/Suburbana): ");
							pessoaFisica.setZona(leitor.next());
							System.out.print("Qual o tipo de habitação(Casa/Apartamento): ");
							pessoaFisica.setTipo(leitor.next());
							System.out.print("Qual o endereço(Ex: Rua, Bairro, Cidade-ES, Numero)");
							pessoaFisica.setEndereco(leitor.next());
							System.out.print("Qual a quantidade de comodos de imovel: ");
							pessoaFisica.setQtdComodos(leitor.nextByte());
							System.out.print("Qual o valor do Imovel: ");
							pessoaFisica.setValorImovel(leitor.nextFloat());
							
							pessoaFisica.setCliente(perfilPf);							
							clientePf[clienteIndexresidencial] = pessoaFisica;
							clienteIndexresidencial++;
						}
						else if(clienteTipo == 2)
						{
							PessoaJuridica perfilPj = new PessoaJuridica();
							ImovelEmpresarial pessoaEmpresarial = new ImovelEmpresarial();
							
							System.out.println("Informe o nome da Empresa: ");
							perfilPj.setNome(leitor.nextLine());
							System.out.println("Informe o telefone geral da Empresa: ");
							perfilPj.setTelefone(leitor.nextLong());
							System.out.println("Informe o CNPJ da Empresa, sem traço ou ponto: ");
							perfilPj.setCNPJ(leitor.nextByte());							
							System.out.println("Informe o nº de funcionarios na Empresa: ");
							pessoaEmpresarial.setNumFuncionarios(leitor.nextByte());
							System.out.println("Informe o nº médio de visitas por dia: ");
							pessoaEmpresarial.setNumVisitasDiarias(leitor.nextByte());
							System.out.println("Informe em qual ramo a empresa atua <C-comércio>,<I-indústria> ou <A-agropecuária>: ");
							pessoaEmpresarial.setRamo(leitor.next());
							System.out.println("");
							//pessoaEmpresarial.setSeguro(seguro);
							
							pessoaEmpresarial.setCliente(perfilPj);
							clientePj[clienteIndexempresarial] = pessoaEmpresarial;
							clienteIndexempresarial++;
						}
						else
						{
							
						}
						break;
						
				case 2:{
					
				}break;
				
				case 3:{
					
				}break;
				
				case 4:{
					
				}break;
				
				case 5:{
					
				}break;
				
				case 6:{
					
				}break;
				
				case 7:{
					
				}
				}
			
		}while(opcao != 8);
		
		leitor.close();
		System.out.println("Você Saiu! Até mais.");
	}
}