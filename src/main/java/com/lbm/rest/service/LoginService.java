package com.lbm.rest.service;

import com.lbm.rest.model.LoginRequest;
import com.lbm.rest.model.LoginResponse;

public interface LoginService {

  LoginResponse login(LoginRequest loginRequest);

}
