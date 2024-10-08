//escrava um programa que conte o numero de vezes que um caractere aparece na palavra


public class Discursiva2 {
 public static void main(String[] args) {
  String palavra = "CAMISETA";
  char letra = 'A';
  int contador = 0;
  char[] vetor = palavra.toCharArray();
  for (int i = 0; i < vetor.length; i++) {
   if (vetor[i] == letra) {
    contador++;
   }
  }
  System.out.println(contador);
 }
}
