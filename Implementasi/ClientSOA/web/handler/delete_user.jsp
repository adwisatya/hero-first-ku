<%-- 
    Document   : addpost
    Created on : Nov 18, 2014, 5:22:59 PM
    Author     : adwisatya
--%>
<%@page import="classes.Client"%>
<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<%@include file= "/WEB-INF/jspf/koneksi.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        String user_username = request.getParameter("user_username");
        out.println(user_username);
        if(user_username != null){
                Client cli = new Client();
                cli.delUser(user_username);
        }
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", "../userAdm.jsp");
%>