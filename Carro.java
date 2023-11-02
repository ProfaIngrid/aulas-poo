public class Carro {
  private String nome;
  String cor;
  int ano;
  boolean combustivel;
  double velocidade;
  double km;

  void carro(String c, int a, boolean cb, double km){
    this.cor = c;
    this.ano = a;
    this.combustivel = cb;

    setKm(1000);
  }

  void setKm(double newKm){
    this.km = newKm;
  }
  
  void dadosCarro() {
    //System.out.println("nome: " + nome);
    System.out.println("cor: " + cor);
    System.out.println("ano: " + ano);
    System.out.println("KM: " + km);
  }

  void andar(){
    if(combustivel == true){
      System.out.println("Carro em movimento!");
    }else{
      System.out.println("Carro não pode andar!");
    }

  }

  void acelerar(double novaVelo){
    
    velocidade += novaVelo;
   
    System.out.println("Velocidade atual: " + velocidade);
  
  }
  

  void frear(double novaVelo){
    
    velocidade -= novaVelo;

    if(velocidade <= 0){
      System.out.println("Carro parou");
    }else{
      System.out.println("Velocidade atual " + velocidade);
    }
    
  }

  public void setNome(String novoNome){
    this.nome = novoNome;
  }

  public void getNome(){
    System.out.println(nome);
  }

  
  
}