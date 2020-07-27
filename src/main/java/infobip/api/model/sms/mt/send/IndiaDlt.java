package infobip.api.model.sms.mt.send;

import java.util.Objects;

public class IndiaDlt {

  private String contentTemplateId;
  private String principalEntityId;

  public String getContentTemplateId() {
    return contentTemplateId;
  }

  public void setContentTemplateId(String contentTemplateId) {
    this.contentTemplateId = contentTemplateId;
  }

  public String getPrincipalEntityId() {
    return principalEntityId;
  }

  public void setPrincipalEntityId(String principalEntityId) {
    this.principalEntityId = principalEntityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndiaDlt indiaDlt = (IndiaDlt) o;
    return Objects.equals(contentTemplateId, indiaDlt.contentTemplateId) &&
        Objects.equals(principalEntityId, indiaDlt.principalEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentTemplateId, principalEntityId);
  }

  @Override
  public String toString() {
    return "IndiaDlt{" +
        "contentTemplateId='" + contentTemplateId + '\'' +
        ", principalEntityId='" + principalEntityId + '\'' +
        '}';
  }
}
