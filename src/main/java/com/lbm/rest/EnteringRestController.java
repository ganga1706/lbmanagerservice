package com.lbm.rest;

import com.lbm.rest.model.LoginRequest;
import com.lbm.rest.model.LoginResponse;
import com.lbm.rest.model.RegistrationRequest;
import com.lbm.rest.model.RegistrationResponse;
import com.lbm.rest.model.ResponseContext;
import com.lbm.rest.service.LoginService;
import com.lbm.rest.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "rest/entering/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class EnteringRestController {

  @Autowired
  LoginService loginsevice;

  @Autowired
  RegistrationService registerService;

  @PostMapping(value = "login")
  public LoginResponse login(@RequestBody LoginRequest loginRequest) {
    LoginResponse loginResponse = new LoginResponse();
    ResponseContext responseContext = new ResponseContext();
    if (loginRequest.getUserName() == null) {
      responseContext.setRequestId(loginRequest.getRequestContext().getRequestId());
      responseContext.setResponseCode("0001");
      responseContext.setResponseMessage("Invalid UserName");
      loginResponse.setResponseContext(responseContext);
    } else if (loginRequest.getPassword() == null) {
      responseContext.setRequestId(loginRequest.getRequestContext().getRequestId());
      responseContext.setResponseCode("0002");
      responseContext.setResponseMessage("Invalid UserName");
      loginResponse.setResponseContext(responseContext);
    }

    loginResponse = loginsevice.login(loginRequest);
    return loginResponse;
  }

  @PostMapping(value = "saveUser")
  public RegistrationResponse saveUser(@RequestBody RegistrationRequest registrationRequest) {
    RegistrationResponse registrationResponse = new RegistrationResponse();
    ResponseContext responseContext = new ResponseContext();
    if (registrationRequest.getPhNumber() == null) {
      responseContext.setRequestId(registrationRequest.getRequestContext().getRequestId());
      responseContext.setResponseCode("0001");
      responseContext.setResponseMessage("invalid moblile number");
      registrationResponse.setResponseContext(responseContext);
    } else if (registrationRequest.getPhNumber().startsWith("5")) {
      responseContext.setRequestId(registrationRequest.getRequestContext().getRequestId());
      responseContext.setResponseCode("0002");
      responseContext.setResponseMessage("worning format");
      registrationResponse.setResponseContext(responseContext);
    }

    registrationResponse = registerService.registration(registrationRequest);
    responseContext.setResponseCode("0000");
    responseContext.setResponseMessage("suceess");
    registrationResponse.setResponseContext(responseContext);
    return registrationResponse;
  }

}
