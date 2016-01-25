/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DAO.impl;

import business.DAO.ITrackDAO;
import business.model.Track;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Quentin
 */
public class TrackDAO extends HibernateDaoSupport implements ITrackDAO {

    @Override
    public void save(Track track) {
        getHibernateTemplate().save(track);
    }

    @Override
    public void update(Track track) {
        getHibernateTemplate().update(track);
    }

    @Override
    public void delete(Track track) {
        getHibernateTemplate().delete(track);
    }

    @Override
    public Track findByTrackCode(String trackID) {
        List list = getHibernateTemplate().find("from Track where track_id = ?", trackID);
        return (Track) list.get(0);
    }
    
}
