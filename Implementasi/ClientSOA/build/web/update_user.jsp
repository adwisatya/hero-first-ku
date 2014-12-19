<%-- 
    Document   : update_user
    Created on : Nov 20, 2014, 6:45:17 PM
    Author     : adwisatya
--%>
<%@page import="java.util.List"%>
<%@page import="classes.Client"%>
<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<%@include file= "/WEB-INF/jspf/koneksi.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="description" content="Simple Blog">
	<meta name="author" content="Bangsatya">
	
	<!-- Twitter Card -->
	<meta name="twitter:card" content="summary">
	<meta name="twitter:site" content="omfgitsasalmon">
	<meta name="twitter:title" content="Simple Blog">
	<meta name="twitter:description" content="Simple Blog">
	<meta name="twitter:creator" content="Bangsatya Blog">
	<meta name="twitter:image:src" content="{{! TODO: ADD GRAVATAR URL HERE }}">
	
	<meta property="og:type" content="article">
	<meta property="og:title" content="Simple Blog">
	<meta property="og:description" content="Deskripsi Blog">
	<meta property="og:image" content="{{! TODO: ADD GRAVATAR URL HERE }}">
	<meta property="og:site_name" content="Simple Blog">
	
	<link rel="stylesheet" type="text/css" href="assets/css/screen.css" />
	<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
	
	<!--[if lt IE 9]>
	    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	<title>Simple Blog of Bangsatya | Update User</title>
</head>
<body>
<div class="wrapper">
<jsp:include page="header.jsp"/>
<%
	String usrC=" ";
	int typeC=4;
	Cookie[] cookies = null;
	cookies = request.getCookies();
	if (cookies!=null){
		for (Cookie c:cookies){
			if (c.getName().equals("LogName")){
				usrC=c.getValue();
				for (Cookie c2:cookies){
				    if (c2.getName().equals("LogType")){
							typeC=Integer.parseInt(c2.getValue());
						}
				}
			}
		}
	}
%>
<article class="art simple post" style="margin-top:120px;">
	<div class="art-body" style="margin-top:70px">
        <div class="art-body-inner">
       	<%
       	if (typeC!=3) {
       	%>
		You can't edit user info
       	<% } else { %>
        <h2>Update User Info</h2>
        <div id="contact-area">
        <%
                Client cli = new Client();
                List<String> ls = cli.readUser(request.getParameter("id"));
		%>
		<form method="post" action="handler/update.jsp">
			<label>Nama: </label><input type="text" id="user_name" name="user_name" value="<%=ls.get(0)%>">
			<br/>
                        <label>Username: </label><input type="text" value="<%=ls.get(1)%>" disabled="true">
			<input type="hidden" id="user_username" name="user_username" value="<%=ls.get(1)%>">
                        <br/>
			<label>Password: </label><input type="text" id="user_password" name="user_password" value="<%=ls.get(2)%>">
			<br/>
			<label>Email: </label><input type="text" id="user_email" name="user_email" value="<%=ls.get(3)%>">
			<br/>
			<label>Status</label>
				<select id="user_status" name="user_status" value="1">
					<option value="1" <%=ls.get(4).equals("3")?"selected":""%>> Admin </option>
					<option value="2" <%=ls.get(4).equals("1")?"selected":""%>> Owner </option>
					<option value="3" <%=ls.get(4).equals("2")?"selected":""%>> Editor </option>
				</select>
			<br/>
			<input type="submit" class="submit-button" value="Ubah">
		</form>
		</div>
	</div>
        <% } %>
</div>
</article>

<jsp:include page="footer.jsp"/>
</div>
</body>
</html>

