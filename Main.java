class Main {
  public static void main(String[] args) {
    Carro c1 = new Carro();
    Carro c2 = new Carro(); 

    // c1.carro("vermelho", 1995, true, 55);
    // c1.dadosCarro();

    c2.carro("preto", 2023, true, 40);
    
    c2.dadosCarro();

    c2.setKm(0);
    c2.dadosCarro();
    // c1.cor = "Vermelho";
    // c1.ano = 1995;
    // c1.combustivel = true;
    // c1.velocidade = 55;

    // c1.setNome("Ford");
    // c1.getNome();
    

    // c1.acelerar(20);
    // c1.frear(80);
  }
}

