package com.lbm.rest.model;

public class UserResponse {

  private String errorCode;
  private String errorMessage;

  /**
   * @return the errorCode
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * @param errorCode the errorCode to set
   */
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * @param errorMessage the errorMessage to set
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("UserResponse [errorCode=");
    builder.append(errorCode);
    builder.append(", errorMessage=");
    builder.append(errorMessage);
    builder.append("]");
    return builder.toString();
  }

}
