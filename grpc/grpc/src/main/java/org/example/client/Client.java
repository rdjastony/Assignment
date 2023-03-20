package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.UserRequest;
import org.example.UserResponse;
import org.example.UserServceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Client {

        static Logger logger = LoggerFactory.getLogger(Client.class);
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

        UserServceGrpc.UserServceBlockingStub blockingStub = UserServceGrpc.newBlockingStub(managedChannel);

        UserResponse userResponse = blockingStub.getUser(UserRequest.newBuilder().setId(1).build());

        logger.info("response ="+ userResponse.getName() +" "+userResponse.getAge());
    }
}
