package com.rdpgroupbd.apps.struts.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.rdpgroupbd.apps.struts.domain.T01I001;
import com.rdpgroupbd.apps.struts.serv.IT01I001Service;

@Namespace("/continent")
@ResultPath(value = "/")
@Result(name = "success", location = "add.jsp")
public class ContinentAction extends ActionSupport implements Serializable {

	private static final long serialVersionUID = 3789030925623191597L;
	private static Logger log = LoggerFactory.getLogger(ContinentAction.class);

	@Autowired
	private IT01I001Service service;

	private T01I001 continent = new T01I001();
	private List<T01I001> continents = new ArrayList<T01I001>();

	@Action(value = "addContinent", results = { @Result(name = "success", type = "redirectAction", params = {"actionName", "all" }) })
	public String addContinent() {
		service.save(continent);
		log.info("ADD");
		return SUCCESS;
	}

	@Action(value = "all", results = { @Result(name = "success", location = "list.jsp") })
	public String findAll() {
		continents = service.get();
		log.info("ALL");
		return SUCCESS;
	}

	public void prepare() throws Exception {
		// TODO
	}

	public T01I001 getContinent() {
		return continent;
	}

	public void setContinent(T01I001 continent) {
		this.continent = continent;
	}

	public List<T01I001> getContinents() {
		return continents;
	}

	public void setContinents(List<T01I001> continents) {
		this.continents = continents;
	}

}
