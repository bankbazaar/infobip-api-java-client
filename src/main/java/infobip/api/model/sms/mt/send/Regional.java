package infobip.api.model.sms.mt.send;

import java.util.Objects;

/**
 * This is a generated class and is not intended for modification!
 */
public class Regional {

    private IndiaDlt indiaDlt;

    public IndiaDlt getIndiaDlt() {
        return indiaDlt;
    }

    public void setIndiaDlt(IndiaDlt indiaDlt) {
        this.indiaDlt = indiaDlt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Regional regional = (Regional) o;
        return Objects.equals(indiaDlt, regional.indiaDlt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indiaDlt);
    }

    @Override
    public String toString() {
        return "Regional{" +
            "indiaDlt=" + indiaDlt +
            '}';
    }
}