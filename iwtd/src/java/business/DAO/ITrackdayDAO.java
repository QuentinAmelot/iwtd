package business.DAO;

import business.model.Trackday;
import java.util.Date;
import java.util.List;

public interface ITrackdayDAO {

    void save(Trackday trackday);

    void update(Trackday trackday);

    void delete(Trackday trackday);

    Trackday findByTrackCode(String td_id);

    List<Trackday> findByRequest(Date from, Date to);

}
