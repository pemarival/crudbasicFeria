import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Course;

@Repository
public interface CourseRepository 
extends JpaRepository<Course, Integer>
{
	@Query(""
			+ "SELECT "
			+ "f "
			+ "FROM "
			+ "feria f "
			+ "WHERE "
			+ "c.name like %?1%"
			)
	public List<Course>filterByName(String name);
	


}
