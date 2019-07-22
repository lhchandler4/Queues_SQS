# Queues_SQS

This is a demo of AWS' SQS with Java

## Instructions:

#### Step 1: Download Files
```
 $ git clone https://github.com/lhchandler4/Queues_SQS.git
```

#### Step 2: Create AWS Queue
- Ensure the queue is a `Standard Queue`
- Make note of the queue name and URL

#### Step 3: Add the Queue URLs 
- In the SendAndReceive.java file add the Queue specific URLs for Queue A, Queue B, and Queue C
(line 11, 12, 13)

#### Step 4: Ensure in your terminal environment that `AWS configure` is setup correctly
- From the command line, run the following:
```
 $ aws configure
```
- Add in your AWS client key and secret key


## Resources and acknowledgements:
- https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/standard-queues-getting-started-java.html
- Stephen Chu for helping 


