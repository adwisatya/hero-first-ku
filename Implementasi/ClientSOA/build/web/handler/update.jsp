<%-- 
    Document   : update.jsp
    Created on : Nov 20, 2014, 8:52:38 PM
    Author     : adwisatya
--%>
<%@page import="classes.Client"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<%@include file= "/WEB-INF/jspf/koneksi.jspf" %>
<%
	String user_name	=	 request.getParameter("user_name");
        String user_username = request.getParameter("user_username");
        String user_password = request.getParameter("user_password");
        String user_status = request.getParameter("user_status");
        String user_email	=	 request.getParameter("user_email");
	Client cli= new Client();
        cli.updateUser(user_username,user_name,user_password,user_email,user_status);
	response.setStatus(response.SC_MOVED_TEMPORARILY);
	response.setHeader("Location", "../update_user.jsp?id="+user_username);
%>
