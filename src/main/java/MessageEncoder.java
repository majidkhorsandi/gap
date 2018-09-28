import javax.json.Json;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Message> {

    public String encode(final Message message) throws EncodeException {
        return Json.createObjectBuilder()
                .add("message", message.content())
                .add("sender", message.sender())
                .add("received", "")
                .build().toString();
    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}