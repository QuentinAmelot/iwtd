/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DAO.impl;

import business.DAO.ITdlistDAO;
import business.model.Tdlist;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Quentin
 */
public class TdlistDAO extends HibernateDaoSupport implements ITdlistDAO {

    @Override
    public void save(Tdlist tdlist) {
        getHibernateTemplate().save(tdlist);
    }

    @Override
    public void update(Tdlist tdlist) {
        getHibernateTemplate().update(tdlist);
    }

    @Override
    public void delete(Tdlist tdlist) {
        getHibernateTemplate().delete(tdlist);
    }

    @Override
    public Tdlist findByListId(String tdlist_id) {
        List list = getHibernateTemplate().find("from Tdlist");
        return (Tdlist) list.get(0);
    }

}
