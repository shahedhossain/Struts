package com.rdpgroupbd.apps.struts.repo;

import java.util.List;

import com.rdpgroupbd.apps.struts.domain.T01I001;

public interface IT01I001Dao {

	public void delete(T01I001 e);

	public List<T01I001> get();

	public T01I001 get(Integer id);

	public List<T01I001> get(T01I001 e);

	public void save(T01I001 e);

	public void update(T01I001 e);

}
