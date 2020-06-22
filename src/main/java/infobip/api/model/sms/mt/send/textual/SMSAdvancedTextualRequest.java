package infobip.api.model.sms.mt.send.textual;

import infobip.api.model.sms.mt.send.Message;
import infobip.api.model.sms.mt.send.Tracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSAdvancedTextualRequest {

  private Tracking tracking;
  private List<Message> messages = new ArrayList<>();
  private String bulkId;

  public SMSAdvancedTextualRequest() {
  }

  public SMSAdvancedTextualRequest addMessages(Message... messages) {
    this.messages.addAll(Arrays.asList(messages));
    return this;
  }

  public SMSAdvancedTextualRequest removeMessages(Message... messages) {
    this.messages.removeAll(Arrays.asList(messages));
    return this;
  }

  public Tracking getTracking() {
    return this.tracking;
  }

  public SMSAdvancedTextualRequest setTracking(Tracking tracking) {
    this.tracking = tracking;
    return this;
  }

  public List<Message> getMessages() {
    return this.messages;
  }

  public SMSAdvancedTextualRequest setMessages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public String getBulkId() {
    return this.bulkId;
  }

  public SMSAdvancedTextualRequest setBulkId(String bulkId) {
    this.bulkId = bulkId;
    return this;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }

    SMSAdvancedTextualRequest o = (SMSAdvancedTextualRequest) obj;
    if (this.tracking == null) {
      if (o.tracking != null) {
        return false;
      }
    } else if (!this.tracking.equals(o.tracking)) {
      return false;
    }
    if (this.messages == null) {
      if (o.messages != null) {
        return false;
      }
    } else if (!this.messages.equals(o.messages)) {
      return false;
    }
    if (this.bulkId == null) {
      if (o.bulkId != null) {
        return false;
      }
    } else if (!this.bulkId.equals(o.bulkId)) {
      return false;
    }

    return true;
  }

  @Override
  public String toString() {
    return "SMSAdvancedTextualRequest{" +
        "tracking='" + tracking + "'" +
        ", messages='" + messages + "'" +
        ", bulkId='" + bulkId + "'" +
        '}';
  }
}