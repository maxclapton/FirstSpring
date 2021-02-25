package max.spring.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRepository extends CrudRepository<Holiday, Integer> {
	  List<Holiday> findByCountry(String countryName);

	  Holiday findById(int id);
}
