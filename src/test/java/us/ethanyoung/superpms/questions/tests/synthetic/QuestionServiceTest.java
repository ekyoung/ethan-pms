package us.ethanyoung.superpms.questions.tests.synthetic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import us.ethanyoung.superpms.persistence.mybatis.QuestionRepositoryImpl;
import us.ethanyoung.superpms.questions.Question;
import us.ethanyoung.superpms.questions.QuestionService;

import java.io.IOException;
import java.util.UUID;

public class QuestionServiceTest {
    private QuestionService questionService;

    @Before
    public void CreateService() {
        questionService = new QuestionService(new QuestionRepositoryImpl());
    }

    @Test
    public void GivenNoQuestionsHaveBeenSubmitted_WhenISubmitAQuestion_ThenThereIsOneQuestionInTheQueue() throws IOException {
        String scope = "test_" + UUID.randomUUID();

        Question question = new Question(scope);
        question.setSubject("Test Question");
        question.setContent("This is the content.");

        questionService.submit(question);

        int count = questionService.getCount(scope);

        assertEquals(1, count);
    }
}
