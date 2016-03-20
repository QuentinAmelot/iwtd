/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DAO.impl;

import business.DAO.ITrackdayDAO;
import business.model.Trackday;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Quentin
 */
public class TrackdayDAO extends HibernateDaoSupport implements ITrackdayDAO {

    @Override
    public void save(Trackday trackday) {
        getHibernateTemplate().save(trackday);
    }

    @Override
    public void update(Trackday trackday) {
        getHibernateTemplate().update(trackday);
    }

    @Override
    public void delete(Trackday trackday) {
        getHibernateTemplate().delete(trackday);
    }

    @Override
    public Trackday findByTrackCode(String td_id) {
        List list = getHibernateTemplate().find("from Trackday where trackday_id = ?", td_id);
        return (Trackday) list.get(0);
    }

    @Override
    public List<Trackday> findByRequest(Date from, Date to) {
        List list = getHibernateTemplate().find("from Trackday");
        return list;
    }
}
