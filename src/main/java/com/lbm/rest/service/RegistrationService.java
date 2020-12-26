package com.lbm.rest.service;

import com.lbm.rest.model.RegistrationRequest;
import com.lbm.rest.model.RegistrationResponse;

public interface RegistrationService {

  RegistrationResponse registration(RegistrationRequest registrationRequest);

}
