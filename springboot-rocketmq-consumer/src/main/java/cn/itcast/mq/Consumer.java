package cn.itcast.mq;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author Tom
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "springboot-mq",consumerGroup = "${rocketmq.consumer.group}")
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("Receive message："+message);
    }
}
