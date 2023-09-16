<%@ page contentType="text/html;charset=UTF-8" %>
<%
  /* Приймаємо параметри, передані з іншого файлу */
  String day = request.getParameter("day") ;
  Integer sale = Integer.parseInt( request.getParameter("sale") ) ;
%>

<div class="col s2">
  <div class="card blue-grey darken-1">
    <div class="card-content white-text">
      <span class="card-title"><%= day %></span>
      <p><%= sale %></p>
    </div>
    <div class="card-action">
      <a href="#">This is a link</a>
    </div>
  </div>
</div>
