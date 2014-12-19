<%-- 
    Document   : trashPost
    Created on : Dec 1, 2014, 9:05:54 PM
    Author     : adwisatya
--%>

<%@page import="classes.Client"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<%@include file= "/WEB-INF/jspf/koneksi.jspf" %>
<%
	String id	=	 request.getParameter("id");
        int i = Integer.parseInt(id);
        Client cli = new Client();
        cli.deletePost(i);
	response.setStatus(response.SC_MOVED_TEMPORARILY);
	response.setHeader("Location", "index.jsp");
%>
