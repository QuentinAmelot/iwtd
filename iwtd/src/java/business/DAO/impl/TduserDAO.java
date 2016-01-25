/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DAO.impl;

import business.DAO.ITduserDAO;
import business.model.Tduser;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Quentin
 */
public class TduserDAO extends HibernateDaoSupport implements ITduserDAO {

    @Override
    public void save(Tduser tduser) {
        getHibernateTemplate().save(tduser);
    }

    @Override
    public void update(Tduser tduser) {
        getHibernateTemplate().update(tduser);
    }

    @Override
    public void delete(Tduser tduser) {
        getHibernateTemplate().delete(tduser);
    }

    @Override
    public Tduser findByTrackCode(String user_id) {
        List list = getHibernateTemplate().find("from Tduser where user_id = ?", user_id);
        return (Tduser) list.get(0);
    }
    
}
