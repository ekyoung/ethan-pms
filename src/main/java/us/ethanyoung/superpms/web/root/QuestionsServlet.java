package us.ethanyoung.superpms.web.root;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import us.ethanyoung.superpms.questions.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet(name = "QuestionsServlet", urlPatterns = {"/questions"})
public class QuestionsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String resource = "us/ethanyoung/superpms/persistence/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            List<Question> questions = sqlSession.selectList("us.ethanyoung.superpms.persistence.mybatis.mappers.QuestionMapper.getAll");
            req.setAttribute("numQuestions", questions.size());
        }
        finally {
            sqlSession.close();
        }


        req.getRequestDispatcher("/WEB-INF/jsp/view/questions.jsp").forward(req, resp);
    }
}
