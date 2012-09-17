package com.rdpgroupbd.apps.struts.action;

import java.io.Serializable;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value = "/")
@Result(name = "success", location = "pages/login.jsp")
public class LoginAction extends ActionSupport implements Serializable {

	private static final long serialVersionUID = 8763371489657441476L;
	@SuppressWarnings("unused")
	private static Logger log = LoggerFactory.getLogger(LoginAction.class);

}
