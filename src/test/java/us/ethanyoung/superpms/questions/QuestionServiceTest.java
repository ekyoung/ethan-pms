package us.ethanyoung.superpms.questions;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

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
        when(mockQuestionRepository.getCount()).thenReturn(count);

        int result = questionService.getCount();

        assertEquals(count, result);
        verify(mockQuestionRepository).getCount();
    }
}
