package mq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Toi on 2017/8/31 11:24.
 */
public class JmsConsumer extends JmsTest {
    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(USR, PASSWORD, URL);
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("Queue");
        MessageConsumer consumer = session.createConsumer(queue);
        while(true){
            TextMessage textMessage= (TextMessage) consumer.receive(1000);
            if(textMessage!=null){
                System.out.println(textMessage.getText());
            }
        }
    }
}
