class ContaBanco {
  int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  public void getDono(){
    System.out.println(dono);
  }

  public void setDono(String d){
    this.dono = d;
  }

  public void getSaldo(){
    System.out.println(this.saldo);
  }

  public void setSaldo(float s){
    this.saldo = s;
  }

  public void getStatus(){
    System.out.println(this.status);
  }

  public void setStatus(boolean s){
    this.status = s;
  }
  
  
}