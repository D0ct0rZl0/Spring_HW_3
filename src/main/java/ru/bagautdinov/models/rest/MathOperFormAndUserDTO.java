package ru.bagautdinov.models.rest;

import ru.bagautdinov.forms.MathOperForm;
import ru.bagautdinov.models.User;

public class MathOperFormAndUserDTO {

    private MathOperForm mathOperForm;
    private User user;

    public MathOperForm getMathOperForm() {
        return mathOperForm;
    }
    public void setMathOperForm(MathOperForm mathOperForm) {
        this.mathOperForm = mathOperForm;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
