package desafios;
import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) throws java.lang.Exception  {
		String texto;
		Scanner teclado = new Scanner (System.in);

System.out.println("Digite o seu texto:");
texto=teclado.nextLine();

System.out.println("Você digitou: " + texto);
System.out.println("O reverso é:");
System.out.println(new Desafio5().reverso(texto).toUpperCase());
}
	
public String reverso(String texto) {
if(texto.isEmpty()) {
    return texto;
}

return texto.substring(texto.length() - 1) + reverso(texto.substring(0, texto.length() - 1));
}

}

