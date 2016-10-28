<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SuperPMS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <link rel="stylesheet" href="<c:url value="/browser/bootswatch-paper/bootstrap.min.css" />" media="screen">
    <link rel="stylesheet" href="<c:url value="/browser/common/main.css" />">
</head>
<body>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a href="<c:url value="/" />" class="navbar-brand">SuperPMS</a>
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">
            <ul class="nav navbar-nav">
                <li>
                    <a href="#">Buy</a>
                </li>
                <li>
                    <a href="#">Questions</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="page-header">
        <h1>SuperPMS</h1>
        <p>Our property management system is the best.</p>
    </div>
</div>

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="<c:url value="/browser/bootstrap-3.3.7-dist/js/bootstrap.min.js" />"></script>

</body>
</html>
