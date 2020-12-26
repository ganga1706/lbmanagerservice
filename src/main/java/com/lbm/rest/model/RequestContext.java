package com.lbm.rest.model;

public class RequestContext {

  private String requestId;

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("RequestContext [requestId=");
    builder.append(requestId);
    builder.append("]");
    return builder.toString();
  }

}
