package springcloudstream.demo.Sources;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public class Source {
    public static final String OUTPUT="output";

    @Output(value = OUTPUT)
    MessageChannel output;
}
