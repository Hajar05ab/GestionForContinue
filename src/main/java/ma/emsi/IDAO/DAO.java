package ma.emsi.IDAO;

import java.util.List;
public interface DAO<T> {

	public T save(T object);

	public T update(T object);

	public void delete(T object);

	public T findById(int id);

	public List<T> findAll();

}
