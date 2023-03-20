package org.example.server;

import org.example.UserRequest;
import org.example.UserResponse;
import org.example.UserServceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GRpcService

public class Server extends UserServceGrpc.UserServceImplBase {

    Logger logger = LoggerFactory.getLogger(Server.class);
    public void getUser(org.example.UserRequest request,
                        io.grpc.stub.StreamObserver<org.example.UserResponse> responseObserver){

        logger.info("got request ="+ request.getId());
        UserResponse userResponse = UserResponse.newBuilder().setAge(20).setName("Abhishek").build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();

    }
}
