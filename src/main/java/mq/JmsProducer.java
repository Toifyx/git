package mq;



import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Toi on 2017/8/31 10:19.
 */
public class JmsProducer extends JmsTest {
    public static void main(String[] args) throws JMSException, InterruptedException {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(USR, PASSWORD, URL);
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("Queue");
        MessageProducer producer = session.createProducer(queue);
        for (int i=0;i<10;i++){
            Message message=session.createTextMessage("Test Message:"+i);
            Thread.sleep(1000);
            producer.send(message);
        }


        connection.close();
    }
}
