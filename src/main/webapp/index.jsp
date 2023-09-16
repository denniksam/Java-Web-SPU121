<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String context = request.getServletContext().getContextPath();   // /JavaWeb - контекст, заданий у конфігурації
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
            <li><a href="<%= context %>/about-jsp.jsp">JSP</a></li>
            <li><a href="badges.html">Components</a></li>
            <li><a href="collapsible.html">JavaScript</a></li>
        </ul>
    </div>
</nav>
<div class="container">
<h1>Java. Web проєктування</h1>
<h2>Встановлення та налаштування</h2>
<p>
    Створюємо новий проєкт. Обираємо Maven Archetype -- webapp, змінюємо
    базовий пакет, задаємо назву проєкту. Після створення корегуємо
    /src/main/webapp/index.jsp - додаємо директиву JSP
    <code>
    &lt;%@ page contentType="text/html;charset=UTF-8" %>
    </code>
</p>
<p>
    Налаштовуємо конфігурацію запуску. Необхідно встановити веб-сервер для Java.
    Серед найбільш поширених: Tomcat (8.5), Glassfish (4 або 5), JBoss, WildFly, тощо.
    Частіше за все достатньо завантажити архів сервера та розпакувати його
    в окрему папку (без кириличних символів у шляху).<br/>
    Edit Configuration -- + -- Tomcat Local  -- Configure  -- вибираємо папку сервера
    (розпаковки) -- Додаємо артефакт деплою (Fix або вкладка Deploy)  --
    ...war exploded.
    За бажанням змінюємо контекст (адресу сайту) та змінюємо реакцію на перезапуск
    (On Update action) - оновлення ресурсів
</p>
<p>
    Додаємо до залежностей пакет servlet-api

</p>
</div>
<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
