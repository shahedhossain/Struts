package com.rdpgroupbd.apps.struts.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.rdpgroupbd.apps.struts.domain.T01I001;

@Repository
public class T01I001Dao implements IT01I001Dao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<T01I001> get() throws DataAccessException {
		return getSession().createCriteria(T01I001.class).list();
	}

	public void delete(T01I001 e) {
		getSession().delete(e);

	}

	public T01I001 get(Integer id) {
		return (T01I001) getSession().get(T01I001.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<T01I001> get(T01I001 e) {
		Example where = Example.create(e);
		where.ignoreCase().enableLike(MatchMode.START);
		return getSession().createCriteria(T01I001.class).add(where).list();
	}

	public void save(T01I001 e) {
		getSession().save(e);
	}

	public void update(T01I001 e) {
		getSession().saveOrUpdate(e);
	}
}
