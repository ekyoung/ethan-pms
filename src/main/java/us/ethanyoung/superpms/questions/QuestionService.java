package us.ethanyoung.superpms.questions;

import java.io.IOException;

public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public int getCount(String scope) throws IOException {
        return questionRepository.getCount(scope);
    }

    public void submit(Question question) throws IOException {
        //Imaginary logic here

        //The common case is for a service to submit one entity, and raise one event
        questionRepository.save(question);
        //messenger.raise(questionSubmittedEvent);
    }
}
