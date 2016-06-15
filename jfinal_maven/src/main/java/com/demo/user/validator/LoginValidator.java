package com.demo.user.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 15:32
 */
public class LoginValidator extends Validator {
    @Override
    protected void validate(Controller controller) {
        validateRequired("username","nameError","username is null");
        validateRequired("password","passError","password is null");
    }

    @Override
    protected void handleError(Controller controller) {

    }
}
