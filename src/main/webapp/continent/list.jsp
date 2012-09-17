<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL</title>
</head>
<body>
<div>
	<s:url id="addUser" value="addContinent.action"/>
	<s:a href="%{addUser}">Add</s:a>
</div>
<s:if test="continents.size > 0">
	<table id="users">
		<s:iterator value="continents">
			<tr>
				<td><s:property value="nameEn" /></td>
				<td><s:property value="nameBn" /></td>
				<td>
					<s:url id="deleteUser" value="deleteContinent.action">
						<s:param name="continent.continentId" value="continentId" />
					</s:url>
					<s:a href="%{deleteUser}">Delete</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
</s:if>
</body>
</html>