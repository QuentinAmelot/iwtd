package business.DAO;

import business.model.Tdlist;

public interface ITdlistDAO {
	
	void save(Tdlist tdlist);
	
	void update(Tdlist tdlist);
	
	void delete(Tdlist tdlist);
	
	Tdlist findByListId(String tdlist_id);

}
