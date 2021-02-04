package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class UserDaoImp implements UserDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public void add(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("from User");
        return query.getResultList();
    }


    @Override
    public User getUser(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(User.class, id);
    }


    @Override
    public void updateUser(User user, Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        User newUser = entityManager.find(User.class, id);

        newUser.setName(user.getName());
        newUser.setSurname(user.getSurname());
        newUser.setAge(user.getAge());

        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteUser(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.remove(getUser(id));
        entityManager.getTransaction().commit();
    }

}
