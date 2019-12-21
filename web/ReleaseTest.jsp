<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<s:form action="releasetest" method="post">
    <s:textfield name="releaseTest.tId" label="教师编号"></s:textfield>
    <s:textfield name="releaseTest.clId" label="课程编号"></s:textfield>
    <s:textarea name="releaseTest.context" label="测验内容"></s:textarea>
    <s:textfield name="releaseTest.type" label="题目类型"></s:textfield>
    <s:textfield name="releaseTest.startTime" label="开始时间"></s:textfield>
    <s:textfield name="releaseTest.endTime" label="结束时间"></s:textfield>
    <s:textfield name="releaseTest.answer" label="答案"></s:textfield>
    <s:submit value="提交"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>
