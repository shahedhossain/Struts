package com.rdpgroupbd.apps.struts.action;

import java.io.Serializable;

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

@Namespace("/User")
@ResultPath(value = "/")
public class WelcomeUserAction extends ActionSupport implements Serializable {

	private static final long serialVersionUID = 4820700618700013998L;
	private static Logger log = LoggerFactory.getLogger(WelcomeUserAction.class);

	@Autowired
	private IT01I001Service service;
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Action(value = "Welcome", results = { @Result(name = "success", location = "pages/welcome_user.jsp") })
	public String execute() {
		for(T01I001 m:service.get()){
			log.info(String.format("id:%s name:%s", m.getContinentId(), m.getNameEn()));
		}
		return SUCCESS;

	}
}
