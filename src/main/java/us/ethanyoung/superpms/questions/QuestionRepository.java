package us.ethanyoung.superpms.questions;

import java.io.IOException;

public interface QuestionRepository {
    void save(Question question) throws IOException;
    int getCount() throws IOException;
}
