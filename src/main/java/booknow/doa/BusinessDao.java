package booknow.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import booknow.model.BusinessModel;


@Repository
public interface BusinessDao extends CrudRepository<BusinessModel,String>
{
	
}
