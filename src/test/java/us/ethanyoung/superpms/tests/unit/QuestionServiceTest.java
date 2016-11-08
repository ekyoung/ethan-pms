package us.ethanyoung.superpms.tests.unit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import us.ethanyoung.superpms.questions.QuestionRepository;
import us.ethanyoung.superpms.questions.QuestionService;

import java.io.IOException;

public class QuestionServiceTest {

    private QuestionService questionService;

    private QuestionRepository mockQuestionRepository;

    @Before
    public void createService() {
        mockQuestionRepository = mock(QuestionRepository.class);

        questionService = new QuestionService(mockQuestionRepository);
    }

    @Test
    public void inAllCasesWhenICallGetCountThenItReturnsTheResultFromTheRepository() throws IOException{
        int count = 5;
        String scope = "whatever";
        when(mockQuestionRepository.getCount(scope)).thenReturn(count);

        int result = questionService.getCount(scope);

        assertEquals(count, result);
        verify(mockQuestionRepository).getCount(scope);
    }
}
