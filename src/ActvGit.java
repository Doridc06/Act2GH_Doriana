public class ActvGit {

  public static void main(String[] args) {

    final int LONGITUDNUMEROS = 20;
    final int INICIO = 1;
    final int FIN = 10;
    
    System.out.print("NUMEROS ALEATORIOS: ");

    int[] numeros = new int[LONGITUDNUMEROS];

    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numeros[i] = (int) (Math.random() * (FIN - INICIO + 1) + INICIO);

      System.out.println(numeros[i]);
    }
  }
}


