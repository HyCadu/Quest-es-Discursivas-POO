//O programa recbe um char e um vetor de palavras e retorna o numero de letras da maior palavra com a aletra



public class App {
    public static void main(String[] args) throws Exception {
        String[] palavras = {"Amora", "Abacate","Amor"};
        char letra = 'A';
        int maior = 0;
        for (int i = 0; i < palavras.length; i++){
            char[] c = palavras[i].toCharArray();
            if (c[0] == letra){
                if(palavras[i].length()>maior){
                    maior = palavras[i].length();
                }
            }
        }
        System.out.println(maior);
    }
}
