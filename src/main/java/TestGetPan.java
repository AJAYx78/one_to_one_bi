import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPan {
public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Pan pan=entityManager.find(Pan.class, 1);
	System.out.println("Pan adress "+pan.getAddress());
	System.out.println("Pan number "+pan.getPan_num());
	System.out.println("Pan "+pan.getName());
	
	Person person=pan.getPerson();
	System.out.println("Person name "+person.getName());
	System.out.println("Person email "+person.getEmail());


}
}
