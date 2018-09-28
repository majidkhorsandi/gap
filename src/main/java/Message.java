import com.google.auto.value.AutoValue;

import java.util.Date;

@AutoValue
public abstract class Message {

    public abstract String content();
    public abstract String sender();
    public abstract Date received();

    public static Builder builder() {
        return new AutoValue_Message.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder content(String content);
        public abstract Builder sender(String sender);
        public abstract Builder received(Date received);

        public abstract Message build();
    }
}