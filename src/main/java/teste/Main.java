package teste;

import entities.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaCrud");

        EntityManager em = emf.createEntityManager();

        try {
            Pessoa p1 = new Pessoa(1L, "Pedro", "Duarte");
            em.getTransaction().begin();
            em.persist(p1);
            em.getTransaction().commit();

        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        if(em != null){
            System.out.println("Conexão Estabelecida com sucesso");
        }else {
            System.out.println("Falha ao estabelecer conexão");
        }

        em.clear();
        emf.close();
    }
}