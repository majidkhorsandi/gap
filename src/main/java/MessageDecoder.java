import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.StringReader;
import java.util.Date;

public class MessageDecoder implements Decoder.Text<Message> {

    public Message decode(final String textMessage) throws DecodeException {
        JsonObject jsonObject = Json.createReader(new StringReader(textMessage)).readObject();
        Message message = Message.builder()
                .content(jsonObject.getString("message"))
                .sender(jsonObject.getString("sender"))
                .received(new Date())
                .build();
        return message;
    }

    public boolean willDecode(String s) {
        return (s != null);
    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}