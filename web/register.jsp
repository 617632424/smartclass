<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<s:form action="register" method="post">
    <s:textfield name="regstudent.stuid" label="学号"></s:textfield>
    <s:textfield name="regstudent.stuname" label="姓名"></s:textfield>
    <s:submit value="提交"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>
