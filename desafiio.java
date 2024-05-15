/*************************************************************************************************
Desafio Gira Tempo
instituição: Senai
nome do professor: Tscherly kleber
nome do aluno: Lucas matheus

•Entrada
A entrada contém um número inteiro "M" de Magic (0 ≤ M ≤ 360) representando o grau do
Sol/Lua. Como a posição muda constantemente seu programa receberá diversos casos a cada
segundo (EOF). Na computação, EOF ou fim de arquivo (em inglês: end-of-file), é uma condição
do sistema operacional de um computador, atingida quando não há mais dados a serem lidos
da "origem dos dados".
•Saída
Imprimir uma saudação referente ao período do dia que ele se encontra: Exemplo: "Boa
Tarde!!", "Boa Noite!!", "Bom Dia!!" e "Boa Madrugada, vá dormir !!".

***************************************************************************************************/
/*biblioteca usada para orientação a objetos, como uma caixa de ferramentas!*/
import java.io.IOException;

/*biblioteca Scanner, permite a entrada de dados a partir de um teclado, por exemplo pelo usuário!*/
import java.util.Scanner;
public class Main {
   
    /*metodo principal do programa*/
	public static void main(String[] args) throws IOException {

	/*Chama o scanner, para receber os dados do teclado. "System.in"*/
	Scanner read = new Scanner(System.in);
	System.out.println("Digite um ângulo ou 'fim' para encerrar o programa!");
    
    /*variavel string armazena um texto!*/
	String saudação;
    
    /*loop enquanto*/
	while(read.hasNext()) {
	/*Comparação*/
	if (read.hasNextInt()) {/*has é como se fosse uma variável boolean, verdadeiro e falso!*/
	   int graus = read.nextInt();
	if(graus >= 0 && graus < 90) {
		saudação = "Bom dia Sr.(a), Ja tomou seu café hoje?!";
	}else if(graus >= 90 && graus < 180){
		saudação = "Boa tarde Sr.(a), Cuidado, use protetor solar, sol hoje está queimando!";
	}else if(graus >= 180 && graus < 270){
		saudação = "Boa Noite Sr.(a), A noite é uma criança!";
	}else if(graus >= 270 && graus <= 360){
		saudação = "Boa Madrugada Sr.(a), Hora de dormir, Vá para casa e roupouse!";
	} else {
		saudação = "Entrada inválida. Por favor, digite um ângulo válido ou digite 'fim para encerrar o programa!";
	}
	/*Imprime a string na tela*/
	System.out.println(saudação);
	} else {
	
	/*Outra Variavel do tipo string, recebe a opção do usuario de encerrar o programa!*/	
		String input = read.next();
	
	/*Ferramenta que mesmo digitando em maiusculo vai encerrar o programa!*/
	if(input.equalsIgnoreCase("fim")) {/*com esse input, o usuário digita em maiusculo ou minusculo de varias formas o programa entende encerra o programa!*/
		System.out.println("Encerrando o programa... Até a próxima!");
		break;
	} else {
	System.out.println("Entrada inválida. Por favor, digite um ângulo ou 'fim' para encerrar o programa:");
    }
	}
	}
	read.close();
    }
}