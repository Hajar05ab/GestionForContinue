package ma.emsi.IDAO;

import java.util.List;

public interface DAO<T> {
    T save(T object);
    T update(int id, T object);
    void delete(int id);
    T findById(int id);
    List<T> findAll();
}
