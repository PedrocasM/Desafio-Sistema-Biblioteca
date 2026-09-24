public class Livro {
    private String titulo;
    Boolean disponibilidade;

    public Livro(String titulo, Boolean disponibilidade){
        this.titulo = titulo;
        this.disponibilidade = disponibilidade;
    }

     public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }
         public Boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(Boolean disponibilidade){
        this.disponibilidade = disponibilidade; 
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", disponibilidade=" + disponibilidade +
                '}';
    }
}
