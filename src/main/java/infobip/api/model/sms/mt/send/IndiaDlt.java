package infobip.api.model.sms.mt.send;

import java.util.Objects;

public class IndiaDlt {

  private String indiaDltContentTemplateId;
  private String indiaDltPrincipalEntityId;

  public String getIndiaDltContentTemplateId() {
    return indiaDltContentTemplateId;
  }

  public void setIndiaDltContentTemplateId(String indiaDltContentTemplateId) {
    this.indiaDltContentTemplateId = indiaDltContentTemplateId;
  }

  public String getIndiaDltPrincipalEntityId() {
    return indiaDltPrincipalEntityId;
  }

  public void setIndiaDltPrincipalEntityId(String indiaDltPrincipalEntityId) {
    this.indiaDltPrincipalEntityId = indiaDltPrincipalEntityId;
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
    return Objects.equals(indiaDltContentTemplateId, indiaDlt.indiaDltContentTemplateId) &&
        Objects.equals(indiaDltPrincipalEntityId, indiaDlt.indiaDltPrincipalEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indiaDltContentTemplateId, indiaDltPrincipalEntityId);
  }

  @Override
  public String toString() {
    return "IndiaDlt{" +
        "indiaDltContentTemplateId='" + indiaDltContentTemplateId + '\'' +
        ", indiaDltPrincipalEntityId='" + indiaDltPrincipalEntityId + '\'' +
        '}';
  }
}
