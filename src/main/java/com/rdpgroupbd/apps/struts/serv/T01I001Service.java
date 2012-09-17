package com.rdpgroupbd.apps.struts.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rdpgroupbd.apps.struts.domain.T01I001;
import com.rdpgroupbd.apps.struts.repo.IT01I001Dao;

@Service("T01I001Service")
@Transactional(readOnly = true)
public class T01I001Service implements IT01I001Service {

	@Autowired
	private IT01I001Dao continentDao;

	public List<T01I001> get() {
		return continentDao.get();
	}

	@Transactional(readOnly = false)
	public void delete(T01I001 e) {
		continentDao.delete(e);
	}

	public T01I001 get(Integer id) {
		return continentDao.get(id);
	}

	public List<T01I001> get(T01I001 e) {
		return continentDao.get(e);
	}

	@Transactional(readOnly = false)
	public void save(T01I001 e) {
		continentDao.save(e);
	}

	@Transactional(readOnly = false)
	public void update(T01I001 e) {
		continentDao.update(e);
	}

}
