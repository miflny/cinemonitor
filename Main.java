class Main {
  

  public static void main(String[] args) {
    Filme filme = new Filme();

    filme.setTitulo("Homem Aranha");
    filme.setAno(2002);
    filme.setTipo("Aventura, Ação, Ficção Científica");

    System.out.println("Filme: " + filme.getTitulo());
    System.out.println("Lançado em: " + filme.getAno());
    System.out.println("Gênero: " + filme.getTipo());
  }
}
