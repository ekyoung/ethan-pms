package us.ethanyoung.superpms.persistence.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import us.ethanyoung.superpms.questions.Question;
import us.ethanyoung.superpms.questions.QuestionRepository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepository {

    private SqlSessionFactory sqlSessionFactory;

    private SqlSessionFactory getFactory() throws IOException {
        if (sqlSessionFactory == null) {
            String resource = "us/ethanyoung/superpms/persistence/mybatis/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }

        return sqlSessionFactory;
    }

    private String qualifyStatementName(String name) {
        return "us.ethanyoung.superpms.persistence.mybatis.mappers.QuestionMapper." + name;
    }

    public void save(Question question) throws IOException {
        SqlSession sqlSession = getFactory().openSession();

        try {
            sqlSession.insert(qualifyStatementName("insert"), question);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public int getCount(String scope) throws IOException {
        SqlSession sqlSession = getFactory().openSession();

        try {
            List<Question> questions = sqlSession.selectList(qualifyStatementName("getAll"), scope);
            return questions.size();
        } finally {
            sqlSession.close();
        }
    }
}
