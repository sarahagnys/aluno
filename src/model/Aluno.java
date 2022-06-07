package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @Column(name = "ra_aluno")
    @NotNull
    private int ra;

    @Column(name = "nome_aluno")
    @NotNull
    private int nomeAluno;

    @Column(name = "email", length = 40)
    @NotNull
    private String email;

    @Column(name = "pos_vest", length = 2)
    @NotNull
    private int posVest;

    public int getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(int nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPosVest() {
        return posVest;
    }

    public void setPosVest(int posVest) {
        this.posVest = posVest;
    }

    @Override
    public String toString() {
        return "Alunos [ra_aluno=" + ra + ", nome_aluno=" + nomeAluno + ", email=" + email + ", pos_vest=" + posVest + "]";
    }

}
