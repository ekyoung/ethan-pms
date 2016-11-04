package us.ethanyoung.superpms.web.root;

import us.ethanyoung.superpms.persistence.mybatis.QuestionRepositoryImpl;
import us.ethanyoung.superpms.questions.QuestionRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestionsServlet", urlPatterns = {"/questions"})
public class QuestionsServlet extends HttpServlet {
    private QuestionRepository questionRepository;

    public QuestionsServlet() {
        questionRepository = new QuestionRepositoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("numQuestions", questionRepository.getCount());

        req.getRequestDispatcher("/WEB-INF/jsp/view/questions.jsp").forward(req, resp);
    }
}
