package com.lbm.rest.service.impl;

import com.lbm.rest.model.LoginRequest;
import com.lbm.rest.model.LoginResponse;
import com.lbm.rest.model.ResponseContext;
import com.lbm.rest.model.UserRequest;
import com.lbm.rest.model.UserResponse;
import com.lbm.rest.service.LoginService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoginServiceImpl implements LoginService {
  RestTemplate restTemplate = null;
  
  @Override
  public LoginResponse login(LoginRequest loginRequest) {
    LoginResponse loginResponse = new LoginResponse();
    ResponseContext responseContext = new ResponseContext();
//    String url = "http://localhost:9001/dbservice/rest/addUser";
//    restTemplate.exchange(url, responseType)
    
    String url = "http://localhost:9001/dbservice/rest/saveUser";
    HttpHeaders headers = new HttpHeaders();

   
    
    
    headers.add("Content-Type", "application/json");
    HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);
    UserResponse userResponse = restTemplate.exchange(url, HttpMethod.POST, entity, UserResponse.class).getBody();
    System.out.println("RegistrationResponse: " + userResponse);
    
    responseContext.setRequestId(loginRequest.getRequestContext().getRequestId());
    responseContext.setResponseCode("0000");
    responseContext.setResponseMessage("success");
    loginResponse.setResponseContext(responseContext);
    loginResponse.setResponseContext(responseContext);

    return loginResponse;
  }

}
