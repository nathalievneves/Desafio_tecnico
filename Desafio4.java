package desafios;

public class Desafio4 {

	public static void main(String[] args) {
	
		double SP=67836.43,RJ=36678.66, MG=29229.88, ES=27165.48, Outros=19849.53; 
		double total=0;
		double percSP=0, percRJ=0, percMG=0, percES=0, percOutros=0;
		
		total= (SP+RJ+MG+ES+Outros);
		percSP= (SP*100)/total;
		percRJ= (RJ*100)/total;
		percMG= (MG*100)/total;
		percES= (ES*100)/total;
		percOutros= (Outros*100)/total;
		
		System.out.println("O faturamento total mensal da distribuidora foi de R$ " +total);
		System.out.printf("O percentual do faturamento de SP foi de %.2f %% %n", (percSP));
		System.out.printf("O percentual do faturamento do RJ foi de %.2f %% %n", (percRJ));
		System.out.printf("O percentual do faturamento de MG foi de %.2f %% %n", (percMG));
		System.out.printf("O percentual do faturamento do ES foi de %.2f %% %n", (percES ));
		System.out.printf("O percentual do faturamento dos outros estados foi de %.2f %% %n", ( percOutros));
		System.out.println("Fim.");

	}
	
	
	}
