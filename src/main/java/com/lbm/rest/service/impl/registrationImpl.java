package com.lbm.rest.service.impl;

import com.lbm.rest.model.RegistrationRequest;
import com.lbm.rest.model.RegistrationResponse;
import com.lbm.rest.model.ResponseContext;
import com.lbm.rest.model.UserRequest;
import com.lbm.rest.model.UserResponse;
import com.lbm.rest.service.RegistrationService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class registrationImpl implements RegistrationService {
  RestTemplate restTemplate = new RestTemplate();

  @Override
  public RegistrationResponse registration(RegistrationRequest registrationRequest) {
    RegistrationResponse registrationResponse = new RegistrationResponse();
    ResponseContext responseContext = new ResponseContext();
    String url = "http://localhost:9001/dbservice/rest/saveUser";
    HttpHeaders headers = new HttpHeaders();

    UserRequest userRequest = new UserRequest();
    userRequest.setEmail(registrationRequest.getEmail());
    userRequest.setPassword(registrationRequest.getPassword());
    userRequest.setPhNumber(registrationRequest.getPhNumber());
    userRequest.setUserName(registrationRequest.getUserName());
    
    
    headers.add("Content-Type", "application/json");
    HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);
    UserResponse userResponse = restTemplate.exchange(url, HttpMethod.POST, entity, UserResponse.class).getBody();
    System.out.println("RegistrationResponse: " + userResponse);
    
    responseContext.setResponseCode("0000");
    responseContext.setResponseMessage("success");
    registrationResponse.setResponseContext(responseContext);
    registrationResponse.setResponseContext(responseContext);
    return registrationResponse;
  }

}
