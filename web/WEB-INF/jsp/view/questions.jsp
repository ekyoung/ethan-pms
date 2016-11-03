<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/base.jspf" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags/template" %>
<t:main htmlTitle="Questions">
    <jsp:body>
        <div class="container">
            <div class="page-header">
                <h1>Questions</h1>
                <p>Ask questions about how super our PMS is.</p>
                <p>There are ${numQuestions} questions in the queue.</p>
            </div>
        </div>
    </jsp:body>
</t:main>