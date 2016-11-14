<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- 기본 템플릿을 작성! -->
<!DOCTYPE html>
<html>
<head>
<style>
div.container {
	width: 100%;
	border: 1px solid gray;
}

header, footer {
	padding: 1em;
	color: white;
	background-color: black;
	clear: left;
	text-align: center;
}

nav {
	float: left;
	width:220px;
	max-width: 220px;
	margin: 0;
	padding: 1em;
}

nav ul {
	list-style-type: none;
	padding: 0;
}

nav ul a {
	text-decoration: none;
	color: black;
}

article {
	margin-left: 250px;
	border-left: 1px solid gray;
	padding: 1em;
	min-height: 550px;
}
</style>
</head>
<body>
	<div class="container">
		<header>
			<tiles:insertAttribute name="header"/>
		</header>
		<nav>
			PASS..
		</nav>
		<article>
			<tiles:insertAttribute name="body"/>
		</article>
		<footer>
			<tiles:insertAttribute name="footer"/>
		</footer>
	</div>
</body>
</html>
