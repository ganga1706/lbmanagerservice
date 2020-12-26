package com.lbm.rest.model;

public class LoginRequest {

  private String userName;
  private String password;
  private RequestContext requestContext;

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the requestContext
   */
  public RequestContext getRequestContext() {
    return requestContext;
  }

  /**
   * @param requestContext the requestContext to set
   */
  public void setRequestContext(RequestContext requestContext) {
    this.requestContext = requestContext;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("LoginRequest [userName=");
    builder.append(userName);
    builder.append(", password=");
    builder.append(password);
    builder.append(", requestContext=");
    builder.append(requestContext);
    builder.append("]");
    return builder.toString();
  }

}
