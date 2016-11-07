package us.ethanyoung.superpms.web.root;

import us.ethanyoung.superpms.persistence.mybatis.QuestionRepositoryImpl;
import us.ethanyoung.superpms.questions.Question;
import us.ethanyoung.superpms.questions.QuestionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestionsServlet", urlPatterns = {"/questions"})
public class QuestionsServlet extends HttpServlet {

    private QuestionService questionService;

    public QuestionsServlet() {
        questionService = new QuestionService(new QuestionRepositoryImpl());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("view", "ask");
        req.setAttribute("numQuestions", questionService.getCount());

        req.getRequestDispatcher("/WEB-INF/jsp/view/questions.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Question question = new Question();
        question.setSubject(req.getParameter("subject"));
        question.setContent(req.getParameter("content"));

        questionService.save(question);

        req.setAttribute("view", "confirmation");

        req.getRequestDispatcher("/WEB-INF/jsp/view/questions.jsp").forward(req, resp);
    }
}
