class Main {
  public static void main(String[] args) {
    ContaBanco conta1 = new ContaBanco();

    conta1.setDono("Ingrid");
    conta1.getDono();

    conta1.setSaldo(10.5f);
    conta1.getSaldo();

    conta1.setStatus(true);
    conta1.getStatus();
  }
}