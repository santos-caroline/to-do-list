package to_do_list;

import java.time.LocalDate;

public class Tarefas {
    //atributos:
    private String titulo;
    private String descricao;
    private LocalDate dataEntrega;
    private Boolean status = true; //verdadeiro para pendentes

    //construtor
    public Tarefas(String titulo, String descricao, LocalDate data_entrega) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataEntrega = data_entrega;
    }

    public Tarefas() {

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ("""
                
                Titulo: %s, Descricão: %s, Data de Entrega: %s, Status: %s
                """).formatted(titulo, descricao, dataEntrega, status);
    }
}
