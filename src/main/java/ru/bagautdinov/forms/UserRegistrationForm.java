package ru.bagautdinov.forms;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@ScriptAssert(lang = "javascript", script = "_this.repassword.equals(_this.password)", message = "Пароли должны совпадать")
public class UserRegistrationForm {

    @NotEmpty(message="Введите пароль")
    @Size(min=6, max=24, message="Минимальная длина пароля: 6, максимальная: 24")
    @Pattern(regexp="^(?:\\d+\\D+|\\D+\\d+)$", message="Пароль должен содержать символы и числа")
    private String password;

    private String repassword;

    @NotEmpty(message="Введите email")
    @Email(message="Проверьте корректность введённого email")
    private String email;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }
    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
