<%@ page contentType="text/html;charset=UTF-8" %>
<%
  String context = request.getServletContext().getContextPath();   // /JavaWeb - контекст, заданий у конфігурації
  // дані про тіло - який файл включати в середину шаблону
  String pageBody = (String) request.getAttribute( "pageBody" ) ;
%>
<html>
<head>
  <title>Java Web</title>
  <!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<nav>
  <div class="nav-wrapper indigo">
    <a href="<%= context %>/" class="brand-logo">Java Web</a>
    <ul id="nav-mobile" class="right hide-on-med-and-down">
      <li class="<%="".equals(pageBody)?"active":"" %>"><a href="<%= context %>/about-jsp.jsp">JSP</a></li>
      <li class="<%="about.jsp".equals(pageBody)?"active":"" %>"><a href="<%= context %>/about">Servlet</a></li>
      <li class="<%="filter.jsp".equals(pageBody)?"active":"" %>"><a href="<%= context %>/filter">Filter</a></li>
    </ul>
  </div>
</nav>
<div class="container">
  <jsp:include page="<%= pageBody %>"/>
</div>
<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
