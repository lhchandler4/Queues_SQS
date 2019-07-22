package Queues_SQS;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageRequest;

import java.util.List;

public class SendAndReceive {
    private static final String QUEUE_A = "https://sqs.us-west-2.amazonaws.com/715742442205/QueueA";
    private static final String QUEUE_B = "https://sqs.us-west-2.amazonaws.com/715742442205/QueueB";
    private static final String QUEUE_C = "https://sqs.us-west-2.amazonaws.com/715742442205/QueueC";

    public static void main(String[] args)
    {
        sendReceive("Hello A" , QUEUE_A);
        sendReceive("Hello B" , QUEUE_B);
        sendReceive("Hello C" , QUEUE_C);
    }

    public static void sendReceive(String msg, String queue){
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        String queueUrl = queue;

        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(msg);
        sqs.sendMessage(send_msg_request);

        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();

        while(messages.size() > 0 ){

            for (Message m : messages) {
                System.out.println(m.getBody());
                sqs.deleteMessage(queueUrl, m.getReceiptHandle());
            }
            messages = sqs.receiveMessage(queueUrl).getMessages();
        }
    }
}

