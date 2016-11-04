<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/base.jspf" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags/template" %>
<t:main htmlTitle="Questions">
    <jsp:body>
        <div class="container">
            <div class="page-header">
                <h1>Questions</h1>
                <p>
                    Ask questions about how super our PMS is.
                </p>
                <c:choose>
                    <c:when test="${view == 'ask'}">
                        <p>
                            Please provide the information below to ask a question. Questions will be answered in the
                            order in which they are received. There are currently ${numQuestions} questions in the queue.
                        </p>
                        <form class="form-horizontal" method="post" action="<c:url value="/questions"/>">
                            <fieldset>
                                <legend>New Question</legend>
                                <div class="form-group">
                                    <label for="inputSubject" class="col-lg-2 control-label">Subject</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="inputSubject" name="subject" placeholder="Subject" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputContent" class="col-lg-2 control-label">Contet</label>
                                    <div class="col-lg-10">
                                        <textarea class="form-control" id="inputContent" name="content" rows="3" placeholder="Can you tell me..."></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-lg-10 col-lg-offset-2">
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </c:when>
                    <c:when test="${view == 'confirmation'}">
                        <p>
                            Thank you for submitting your question. We'll get back to you shortly.
                        </p>
                    </c:when>
                    <c:otherwise>
                        <p>
                            Unsupported view "${view}".
                        </p>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </jsp:body>
</t:main>