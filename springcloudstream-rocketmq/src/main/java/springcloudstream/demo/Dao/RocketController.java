package springcloudstream.demo.Dao;

import com.google.common.collect.Maps;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class RocketController {

    @Resource
    private MessageChannel output;

    @RequestMapping(value = "/rocketmq")
    public void rocketMqTest(){
        Map<String,Object> map = Maps.newConcurrentMap();
        map.put("name","张三");
        map.put("age","20");
        output.send(MessageBuilder.withPayload(map).build());
    }
}
