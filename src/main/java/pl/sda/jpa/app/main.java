package pl.sda.jpa.app;

import pl.sda.jpa.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        //na podstwaie tego entityManagerFactory tworzy createEntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//dowanie
        Employee employee = new Employee();
       // employee.setId(1L);
        employee.setFirstName("Piotr");
        employee.setLastName("Nowak");
        employee.setSalary(3500);

        Employee employee2 = new Employee();
        //employee2.setId(2L);
        employee2.setFirstName("Jan");
        employee2.setLastName("Kowalski");
        employee2.setSalary(3700);
        employee2.setPremia(2500);

        Employee employee3 = new Employee();

        employee3.setFirstName("Krzyś");
        employee3.setLastName("Smyk");
        employee3.setSalary(4200);
//zamykanie
        entityManager.getTransaction().begin();
        entityManager.persist(employee);//1 id
        entityManager.persist(employee2);//2 id
        entityManager.persist(employee3);//2 id
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
