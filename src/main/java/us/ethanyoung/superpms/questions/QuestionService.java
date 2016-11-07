package us.ethanyoung.superpms.questions;

import java.io.IOException;

public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public int getCount() throws IOException {
        return questionRepository.getCount();
    }

    public void save(Question question) throws IOException {
        questionRepository.save(question);
    }
}
