<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add</title>
</head>
<body>
	<s:form name="addForm" method="post" action="addContinent">
		<s:textfield name="continent.nameEn" label="Name En" />
		<s:textfield name="continent.nameBn" label="Name Bn" />
		<s:submit type="button" name="Add" />
	</s:form>
</body>
</html>