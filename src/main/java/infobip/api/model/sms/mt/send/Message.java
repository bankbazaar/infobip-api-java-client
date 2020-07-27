package infobip.api.model.sms.mt.send;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import infobip.api.model.Destination;
import infobip.api.model.sms.mt.send.binary.BinaryContent;
import infobip.api.model.sms.mt.send.Language;
import java.util.Date;
import infobip.api.model.sms.mt.send.DeliveryTimeWindow;
import java.util.Objects;

/**
 * This is a generated class and is not intended for modification!
 */
public class Message {
    private String from;
    private List<String> to = new ArrayList<>();
    private List<Destination> destinations = new ArrayList<>();
    private String text;
    private BinaryContent binary;
    private Boolean flash;
    private Language language;
    private String transliteration;
    private Boolean notify;
    private Boolean intermediateReport;
    private String notifyUrl;
    private String notifyContentType;
    private String callbackData;
    private Long validityPeriod;
    private Date sendAt;
    private DeliveryTimeWindow deliveryTimeWindow;
    private String campaignId;
    private String operatorClientId;
    private Regional regional;

    public Message() {
    }

    public Message addDestinations(Destination... destinations) {
        this.destinations.addAll(Arrays.asList(destinations));
        return this;
    }

    public Message removeDestinations(Destination... destinations) {
        this.destinations.removeAll(Arrays.asList(destinations));
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public Message setFrom(String from) {
        this.from = from;
        return this;
    }

    public List<String> getTo() {
        return this.to;
    }

    public Message setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public Message setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public BinaryContent getBinary() {
        return this.binary;
    }

    public Message setBinary(BinaryContent binary) {
        this.binary = binary;
        return this;
    }

    public Boolean getFlash() {
        return this.flash;
    }

    public Message setFlash(Boolean flash) {
        this.flash = flash;
        return this;
    }

    public Language getLanguage() {
        return this.language;
    }

    public Message setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public String getTransliteration() {
        return this.transliteration;
    }

    public Message setTransliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    public Boolean getNotify() {
        return this.notify;
    }

    public Message setNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    public Boolean getIntermediateReport() {
        return this.intermediateReport;
    }

    public Message setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public Message setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public String getNotifyContentType() {
        return this.notifyContentType;
    }

    public Message setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public Message setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public Message setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public Date getSendAt() {
        return this.sendAt;
    }

    public Message setSendAt(Date sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    public DeliveryTimeWindow getDeliveryTimeWindow() {
        return this.deliveryTimeWindow;
    }

    public Message setDeliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public Message setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getOperatorClientId() {
        return this.operatorClientId;
    }

    public Message setOperatorClientId(String operatorClientId) {
        this.operatorClientId = operatorClientId;
        return this;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(from, message.from) &&
            Objects.equals(to, message.to) &&
            Objects.equals(destinations, message.destinations) &&
            Objects.equals(text, message.text) &&
            Objects.equals(binary, message.binary) &&
            Objects.equals(flash, message.flash) &&
            Objects.equals(language, message.language) &&
            Objects.equals(transliteration, message.transliteration) &&
            Objects.equals(notify, message.notify) &&
            Objects.equals(intermediateReport, message.intermediateReport) &&
            Objects.equals(notifyUrl, message.notifyUrl) &&
            Objects.equals(notifyContentType, message.notifyContentType) &&
            Objects.equals(callbackData, message.callbackData) &&
            Objects.equals(validityPeriod, message.validityPeriod) &&
            Objects.equals(sendAt, message.sendAt) &&
            Objects.equals(deliveryTimeWindow, message.deliveryTimeWindow) &&
            Objects.equals(campaignId, message.campaignId) &&
            Objects.equals(operatorClientId, message.operatorClientId) &&
            Objects.equals(regional, message.regional);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(from, to, destinations, text, binary, flash, language, transliteration, notify,
                intermediateReport, notifyUrl, notifyContentType, callbackData, validityPeriod,
                sendAt,
                deliveryTimeWindow, campaignId, operatorClientId, regional);
    }

    @Override
    public String toString() {
        return "Message{" +
            "from='" + from + '\'' +
            ", to=" + to +
            ", destinations=" + destinations +
            ", text='" + text + '\'' +
            ", binary=" + binary +
            ", flash=" + flash +
            ", language=" + language +
            ", transliteration='" + transliteration + '\'' +
            ", notify=" + notify +
            ", intermediateReport=" + intermediateReport +
            ", notifyUrl='" + notifyUrl + '\'' +
            ", notifyContentType='" + notifyContentType + '\'' +
            ", callbackData='" + callbackData + '\'' +
            ", validityPeriod=" + validityPeriod +
            ", sendAt=" + sendAt +
            ", deliveryTimeWindow=" + deliveryTimeWindow +
            ", campaignId='" + campaignId + '\'' +
            ", operatorClientId='" + operatorClientId + '\'' +
            ", regional=" + regional +
            '}';
    }
}