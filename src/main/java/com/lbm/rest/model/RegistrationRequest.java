package com.lbm.rest.model;

public class RegistrationRequest {

  private RequestContext requestContext;
  private String userName;
  private String phNumber;
  private String password;
  private String email;

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
   * @return the phNumber
   */
  public String getPhNumber() {
    return phNumber;
  }

  /**
   * @param phNumber the phNumber to set
   */
  public void setPhNumber(String phNumber) {
    this.phNumber = phNumber;
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
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("RegistrationRequest [requestContext=");
    builder.append(requestContext);
    builder.append(", userName=");
    builder.append(userName);
    builder.append(", phNumber=");
    builder.append(phNumber);
    builder.append(", password=");
    builder.append(password);
    builder.append(", email=");
    builder.append(email);
    builder.append("]");
    return builder.toString();
  }

}
