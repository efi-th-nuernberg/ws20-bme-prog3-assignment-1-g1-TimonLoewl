class Main {
  public static void main(String[] args) {
    for(int i = 1; i< 201; i++){
      System.out.println(i);
      zahlenfilter(i);
 
    }
  }

  public static void zahlenfilter(int zahl){
      durchFuenfTeilbar(zahl);
      endetAufNeun(zahl);
      addiertMitVorherDurchDreiTeilbar(zahl);
  }

  public static void durchFuenfTeilbar(int zahl){
      if (zahl % 5 == 0){
          System.out.print("ZAHL ist durch 5 teilbar\n");
      }
  }

  public static void endetAufNeun(int zahl){
      if (zahl % 10 == 9 || zahl == 9){
          System.out.print("ZAHL endet auf 9\n");
      }
  }

  public static void addiertMitVorherDurchDreiTeilbar(int zahl){
      if((zahl + (zahl-1)) % 3 == 0){
          int ergebnis = zahl + (zahl-1);
          System.out.print("ZAHL und VORGÄNGER addiert ergeben " + ergebnis + " und " + ergebnis + " ist durch 3 teilbar\n");
      }
  }
}