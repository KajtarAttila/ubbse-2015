package dao.generic.proba;
import java.util.List;

	public interface GenericDao<T> {
		
		List<T> getAllDataRows();
		void insertObjects(List<T> objects );
		void updateObject( T obj );
		void deleteObject( T obj );
		
	}
