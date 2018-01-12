package com.example.trung.calculator.calculator;

import java.util.HashMap;


public class ApplicationController {
    private static HashMap<String, Handler> controlHash = new HashMap<String, Handler>();
    static{
        String numKey = "numKey";

        AddHandler addHandler = new AddHandler();
        controlHash.put("+", addHandler);

        NumberValueHandler numberValueHandler = new NumberValueHandler();
        controlHash.put(numKey, numberValueHandler);

        EqualHanler equalHanler = new EqualHanler();
        controlHash.put("=", equalHanler);

        SubHandler subHandler = new SubHandler();
        controlHash.put("-", subHandler);

        MultiHandler multiHandler = new MultiHandler();
        controlHash.put("x", multiHandler);

        DivideHandler divideHandler = new DivideHandler();
        controlHash.put("÷",divideHandler);

        PercentHandler percentHandler = new PercentHandler();
        controlHash.put("%", percentHandler);

        SignedOrUnsignedHandler signedOrUnsignedHandler = new SignedOrUnsignedHandler();
        controlHash.put("+/-", signedOrUnsignedHandler);
    }

    public static void handleRequest(String command, Object ... parameters) {
        //instead of setting to handler can we use reflection to set the Type of anOperation
        //to the type of the result of controlHash.get(command); thereby giving us flexability
        Handler anOperation = controlHash.get(command);
        anOperation.handlerIt(parameters);


    }

}
