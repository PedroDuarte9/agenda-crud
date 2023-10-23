package entities;

import java.util.Objects;

public class Contato {
    private Long id;
    private String numeroUm;
    private String numeroDois;
    private String email;
    private String emailAlternativo;

    public Contato() {
    }

    public Contato(Long id, String numeroUm, String numeroDois, String email, String emailAlternativo) {
        this.id = id;
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
        this.email = email;
        this.emailAlternativo = emailAlternativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(String numeroUm) {
        this.numeroUm = numeroUm;
    }

    public String getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(String numeroDois) {
        this.numeroDois = numeroDois;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
