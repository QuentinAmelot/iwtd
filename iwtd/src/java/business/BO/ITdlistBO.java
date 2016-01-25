package business.BO;

import business.model.Tdlist;

public interface ITdlistBO {
	
	void save(Tdlist list);
	
	void update(Tdlist list);
	
	void delete(Tdlist list);
	
	Tdlist findByListId(String tdlist_id);

}
