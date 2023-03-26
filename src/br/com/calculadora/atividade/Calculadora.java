package br.com.calculadora.atividade;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Calculadora extends JFrame {
	
	JTextField txtResultado;
	
	
	public Calculadora() {
		// titulo da janela
		setTitle("Calculadora Simples");
		// Tamanho da janela
		setSize(300,400);
		
		// Tipo de layout 
		setLayout(new BorderLayout());
		
		
		//Fechar tudo ao clicar no X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// campo de texto para resultado
		 txtResultado = new JTextField();
		 txtResultado.setFont(new java.awt.Font("tahoma",0,50));
		
		 
		
		
		// criação do painel dos botoes de 1 a 9
		JPanel panNumeros = new JPanel(new GridLayout(4,3));
		
		
		JButton btn1 = new JButton(String.valueOf(1));
		JButton btn2 = new JButton(String.valueOf(2));
		JButton btn3 = new JButton(String.valueOf(3));
		JButton btn4 = new JButton(String.valueOf(4));
		JButton btn5 = new JButton(String.valueOf(5));
		JButton btn6 = new JButton(String.valueOf(6));
		JButton btn7 = new JButton(String.valueOf(7));
		JButton btn8 = new JButton(String.valueOf(8));
		JButton btn9 = new JButton(String.valueOf(9));
		panNumeros.add(btn1);
		panNumeros.add(btn2);
		panNumeros.add(btn3);
		panNumeros.add(btn4);
		panNumeros.add(btn5);
		panNumeros.add(btn6);
		panNumeros.add(btn7);
		panNumeros.add(btn8);
		panNumeros.add(btn9);
		
			
		// Criando botão Limpar
		JButton btnLimpar = new JButton("C");
		
		// Criar botão para o zero
		JButton btn0 = new JButton("0");
		
		// Criar botão  para ponto deciamal
		JButton btnIgual = new JButton("=");
		btnIgual.setMnemonic(java.awt.event.KeyEvent.VK_ENTER);
		

		
		// Inserindo ao panNumerosos botoes 0 "." e C
		panNumeros.add(btnLimpar);
		panNumeros.add(btn0);
		panNumeros.add(btnIgual);
			
		
		
		// Painel e botoes de operações
		JPanel panOperacoes = new JPanel(new GridLayout(4,1));
		JButton btnMais = new JButton("+");
		JButton btnMenos = new JButton("-");
		JButton btnMultiplicacao = new JButton("*");
		JButton btnDivisao = new JButton("/");
		panOperacoes.add(btnMais);
		panOperacoes.add(btnMenos);
		panOperacoes.add(btnMultiplicacao);
		panOperacoes.add(btnDivisao);
		
		
		//Adicionando os componentes ao layout da janela
		add(txtResultado, BorderLayout.NORTH);
		add(panNumeros, BorderLayout.CENTER);
		add(panOperacoes, BorderLayout.EAST);
		
		// Exibir Janela
		setVisible(true);
		
		
		
		
		
		// Adicoonando as ações dos botores ao tratador de evento
		TrataAcao trataBotao = new TrataAcao();
		btn0.addActionListener(trataBotao);
		btn1.addActionListener(trataBotao);
		btn2.addActionListener(trataBotao);
		btn3.addActionListener(trataBotao);
		btn4.addActionListener(trataBotao);
		btn5.addActionListener(trataBotao);
		btn6.addActionListener(trataBotao);
		btn7.addActionListener(trataBotao);
		btn8.addActionListener(trataBotao);
		btn9.addActionListener(trataBotao);
		btnDivisao.addActionListener(trataBotao);
		btnMultiplicacao.addActionListener(trataBotao);
		btnLimpar.addActionListener(trataBotao);
		btnMais.addActionListener(trataBotao);
		btnMenos.addActionListener(trataBotao);
		btnIgual.addActionListener(trataBotao);
		
	}
	
	
	public static void main(String[] args) {
		new Calculadora();
		
		
	}
	
	class TrataAcao implements ActionListener{
		
		ArrayList<String> aux1   = new ArrayList<String>();
		
		double aux;
		String teste = "";
		double numero, resultado; 
		String operacao;

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton botao = (JButton) e.getSource();
			
			
			switch (botao.getText()) {
			
			case "0":{ 
				 aux1.add("0");
				 System.out.println("Botão 0 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
				 
				break;}
			case "1": {
				 aux1.add("1");
				 System.out.println(aux1);
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}			
			case "2": {
				 aux1.add("2");
				 System.out.println("Botao 2 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}				
			case "3": {
				 aux1.add("3");
				 System.out.println("Botao 3 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}
			case "4": {
				 aux1.add("4");
				 System.out.println("Botao 4 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}
			case "5": {
				 aux1.add("5");
				 System.out.println("Botao 5 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}			
			case "6": {
				 aux1.add("6");
				 System.out.println("Botao 6 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}			
			case "7": {
				 aux1.add("7");
				 System.out.println("Botao 7 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;	}		
			case "8": {
				 aux1.add("8");
				 System.out.println("Botao 8 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
				 break;	}
			case "9": {
				 aux1.add("9");
				 System.out.println("Botao 9 clicado");
				 teste = "";
				 for(String n : aux1){
						teste += n;  
					 } 
				 txtResultado.setText(String.valueOf(teste));
				 teste = "";
					break;}		
			
			case "+": {
				
				operacao = "+";
				
				 System.out.println("Botao +");
		
				 for(String n : aux1){
						teste += n;  
					 } 
					 aux =  Double.parseDouble(teste);
					 System.out.println(teste);
				
				 if (resultado != 0){
					 numero= resultado;
				 }else {
					 	numero = aux;
				 	}
				 aux1.clear();
					break;}	
			
			case "-": {
				operacao = "-";
				 System.out.println("Botao -");
				 
				 for(String n : aux1){
						teste += n;  
					 } 
					 aux =  Double.parseDouble(teste);
					 System.out.println(teste);
					 
				 if (resultado != 0){
					 numero=resultado;
				 }else {
					 	numero = aux;
				 	}
				 aux1.clear();
					break;}		
			case "*": {
				operacao = "*";
				 System.out.println("Botao *");
				 
				 for(String n : aux1){
						teste += n;  
					 } 
					 aux =  Double.parseDouble(teste);
					 System.out.println(teste);
					 
				 if (resultado != 0){
					 numero=resultado;
				 }else {
					 	numero = aux;
				 	}
				 aux1.clear();
					break;}				
			case "/": {
				operacao = "/";
				 System.out.println("Botao /");
				 
				 for(String n : aux1){
						teste += n;  
					 } 
					 aux =  Double.parseDouble(teste);
					 System.out.println(teste);
					 
				 if (aux == 0) {
					 txtResultado.setText("ERRO 0");	 
					 
				 }
				 else if(resultado != 0){
					 numero=resultado;
				 }else {
					 	numero = aux;
				 	}
				 aux1.clear();
					break;}		
			case "=": {
				teste="";
				 System.out.println("Botao =");
				 for(String n : aux1){
						teste += n;  
					 } 
					 aux =  Double.parseDouble(teste);
					 System.out.println(teste);
				 
				 switch (operacao) {
				case "+":
					 resultado = numero + aux;
					 txtResultado.setText(String.valueOf(resultado));
					break;
				case "-":
					 resultado = numero - aux;
					 txtResultado.setText(String.valueOf(resultado));
					break;		
				case "*":
					 resultado = numero * aux;
					 txtResultado.setText(String.valueOf(resultado));
					break;		
				case "/":
					 resultado = numero / aux;
					 txtResultado.setText(String.valueOf(resultado));
					break;							
				default:
					
					break;
				}

					break;	}
			case "C": {
				 System.out.println("Botao C");
				 aux = 0;
				 numero = 0;
				 resultado = 0;
				 aux1.clear();
				 teste ="";
				 txtResultado.setText(String.valueOf(resultado));
					break;			
			}
			default: System.out.println("Nenhum botao encontrado");
				
			}
			
		}
		
	}

}
