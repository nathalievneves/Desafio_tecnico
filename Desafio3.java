package desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		

Scanner teclado=new Scanner(System.in);
float [] vetor=new float [31];
float soma=0, media=0, maior=0, menor=1000000, auxiliar;
int diasComFaturamento=0, superiorMedia=0;


for (int aux=0;aux<=30;aux++)
{
System.out.println("Digite o faturamento do dia " + (aux+1) +":");
vetor[aux]=teclado.nextFloat();
soma= soma+ vetor[aux];
auxiliar=vetor[aux];

if (vetor[aux]!=0)
{
	diasComFaturamento++;
}

if (menor>auxiliar) {
	menor=vetor[aux];
}

if (maior<aux) {
	maior=vetor[aux];
} 

}

System.out.println("_____Relatório parcial____");

for (int aux=0; aux<=30; aux++)
{
	System.out.println("Dia " + (aux+1) + ": R$" + vetor[aux]);
			
}

media=(soma/diasComFaturamento);

for (int aux=0; aux<=30; aux++)
{
	if (aux > media) {
		superiorMedia++;
	}
			
}

System.out.println("_____Relatório final____");
System.out.println("Maior valor:" + maior);
System.out.println("Menor valor:" + menor);
System.out.println("Média mensal:" + media);
System.out.println("Número de dias em que o valor foi superior à média mensal:" +superiorMedia);
System.out.println("Fim");
}
}
	


