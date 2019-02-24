<%@page import="java.io.File"%>
<%@page
	import="hu.ak_akademia.buddyfinder.dao.sql.SelectCityByIdSqlReader"%>
<%@page
	import="hu.ak_akademia.buddyfinder.dao.sql.SelectCityByIdSqlWriter"%>
<%@page
	import="hu.ak_akademia.buddyfinder.dao.sql.SelectCityByIdSqlBuilder"%>
<%@page import="hu.ak_akademia.buddyfinder.dao.sql.SqlBuilder"%>
<%@page import="hu.ak_akademia.buddyfinder.dao.CityDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>teszt</title>
</head>
<body>
	Hello
	<% System.out.println(new File(".").getAbsolutePath()); %>
<%-- 	<%=new CityDao().readSingle(new SelectCityByIdSqlBuilder(), new SelectCityByIdSqlWriter(1), new SelectCityByIdSqlReader()) --%>
<!--                     .getCityName()%> -->
</body>
</html>