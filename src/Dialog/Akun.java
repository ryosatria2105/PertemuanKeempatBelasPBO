package Dialog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "akun")
public class Akun {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "question_id")
    private Integer questionId;  // 0 = custom question, 1-5 predefined

    @Column(name = "security_answer")
    private String securityAnswer;  // disimpan plain-text

    @Column(name = "custom_question")
    private String customQuestion; // kalau questionId = 0 → pakai ini

    public Akun() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getCustomQuestion() {
        return customQuestion;
    }

    public void setCustomQuestion(String customQuestion) {
        this.customQuestion = customQuestion;
    }
}



//ini


