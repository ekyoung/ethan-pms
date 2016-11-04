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

    public int getCount() throws IOException {
        String resource = "us/ethanyoung/superpms/persistence/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            List<Question> questions = sqlSession.selectList("us.ethanyoung.superpms.persistence.mybatis.mappers.QuestionMapper.getAll");
            return questions.size();
        }
        finally {
            sqlSession.close();
        }
    }
}
