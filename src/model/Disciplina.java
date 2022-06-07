package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "disciplinas")
public class Disciplina{

    @Id
    @Column(name = "id_disciplina")
    @NotNull
    private int id;

    @Column(name = "nome_disc")
    @NotNull
    private int nomeDisciplina;

    @Column(name = "carga_hora")
    @NotNull
    private int cargaHoraria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(int nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplinas [id_disciplina=" + id + ", nome_disc=" + nomeDisciplina + ", carga_horaria=" + cargaHoraria + "]";
    }

}

