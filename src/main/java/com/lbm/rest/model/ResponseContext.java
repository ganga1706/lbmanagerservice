package com.lbm.rest.model;

public class ResponseContext {

  private String requestId;
  private String responseCode;
  private String responseMessage;

  /**
   * @return the requestId
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * @param requestId the requestId to set
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * @return the responseCode
   */
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * @param responseCode the responseCode to set
   */
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * @return the responseMessage
   */
  public String getResponseMessage() {
    return responseMessage;
  }

  /**
   * @param responseMessage the responseMessage to set
   */
  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ResponseContext [requestId=");
    builder.append(requestId);
    builder.append(", responseCode=");
    builder.append(responseCode);
    builder.append(", responseMessage=");
    builder.append(responseMessage);
    builder.append("]");
    return builder.toString();
  }

}
