package com.lbm.rest.model;

public class RegistrationResponse {

  private ResponseContext responseContext;

  /**
   * @return the responseContext
   */
  public ResponseContext getResponseContext() {
    return responseContext;
  }

  /**
   * @param responseContext the responseContext to set
   */
  public void setResponseContext(ResponseContext responseContext) {
    this.responseContext = responseContext;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("LoginResponse [responseContext=");
    builder.append(responseContext);
    builder.append("]");
    return builder.toString();
  }

}
