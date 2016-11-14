<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	li.a {
	display: inline;
	}
</style>
<h2>오늘의 주요 핵심 뉴스</h2>
<ul>
	<li class="a"><a href="">정치</a></li>
	<li class="a"><a href="">연예</a></li>
	<li class="a"><a href="">세계</a></li>
</ul>
<hr/>
<c:forEach var="t" items="${list }">
	→ ${t } <br/>
</c:forEach>	