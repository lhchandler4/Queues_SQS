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

#### Step 3: Edit the QPublisher and QClient code
For QPublisher, edit the following: `qpublisher/src/main/java/qpublisher/App.java`
- On line 19, change `QueueA` to whatever you named your queue

For QClient, edit the following: `qclient/src/main/java/qclient/App.java`
- On line 17, change `QueueA` to whatever you named your queue

#### Step 4: Ensure in your terminal environment that `AWS configure` is setup correctly
- From the command line, run the following:
```
 $ aws configure
```
- Add in your AWS client key and secret key


## Resources and acknowledgements:
- https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/standard-queues-getting-started-java.html
- Stephen Chu for helping 


