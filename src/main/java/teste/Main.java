package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaCrud");

        EntityManager em = emf.createEntityManager();

        if(em != null){
            System.out.println("Conexão Estabelecida com sucesso");
        }else {
            System.out.println("Falha ao estabelecer conexão");
        }

        em.clear();
        emf.close();
    }
}