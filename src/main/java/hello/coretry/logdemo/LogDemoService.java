package hello.coretry.logdemo;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.coretry.common.MyLogger;

@Service
public class LogDemoService {
    private final MyLogger myLogger;
    //private final ObjectProvider<MyLogger> myLoggerProvider;


    // @Autowired
    // LogDemoService(ObjectProvider<MyLogger> myLoggerProvider){
    //     this.myLoggerProvider = myLoggerProvider;
    // }
    LogDemoService(MyLogger myLogger){
        this.myLogger = myLogger;
    }

    public void logic(String id) {
        //MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
