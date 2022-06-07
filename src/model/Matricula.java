package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "matricula")
public class Matricula extends Aluno{

    @Column(name = "ano")
    @NotNull
    private int anoMatricula;

    @Column(name = "semestre")
    @NotNull
    private int semestreMatricula;

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public void setSemestreMatricula(int semestreMatricula) {
        this.semestreMatricula = semestreMatricula;
    }

    @Override
    public String toString() {
        return "Matricula [ano=" + anoMatricula + ", semestre=" + semestreMatricula + "]";

    }
}
