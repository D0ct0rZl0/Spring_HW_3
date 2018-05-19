package ru.bagautdinov.forms;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

public class MathOperForm {

    @NotEmpty(message="Пожалуйста, введите число!")
    @Pattern(regexp="^\\d+$", message="Проверьте ввод, число не распознано")
    private String number;

    @NotEmpty(message="Вы должны выбрать функцию!")
    private String function;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }

}
