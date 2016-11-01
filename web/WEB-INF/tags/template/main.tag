<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ include file="/WEB-INF/jsp/base.jspf" %>
<!DOCTYPE html>
<html>
<head>
    <title><c:out value="${fn:trim(htmlTitle)}" /> - SuperPMS</title>
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
                    <a href="<c:url value="/purchase" />">Purchase</a>
                </li>
                <li>
                    <a href="<c:url value="/questions" />">Questions</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<jsp:doBody />

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="<c:url value="/browser/bootstrap-3.3.7-dist/js/bootstrap.min.js" />"></script>

</body>
</html>
