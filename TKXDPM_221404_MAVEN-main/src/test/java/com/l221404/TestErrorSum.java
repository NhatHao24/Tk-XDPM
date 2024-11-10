package com.l221404; 

import com.l221404.Database.RequestData;
import com.l221404.ResponseError;  
import com.l221404.Output.AddUIConsoleOutput;
import com.l221404.Usecase.AddUseCaseControl;

public class TestErrorSum {

    public static void main(String[] args) {
        
        AddUseCaseControl addUseCaseControl = new AddUseCaseControl();
        AddUIConsoleOutput addUIConsoleOutput = new AddUIConsoleOutput();

        addUseCaseControl.setAddUIConsoleOutput(addUIConsoleOutput);

        System.out.println("Test Case 1: Valid input (3 + 5)");
        RequestData requestData1 = new RequestData("3", "5");
        addUseCaseControl.execute(requestData1);

        System.out.println("Test Case 2: Invalid input (empty number)");
        RequestData requestData2 = new RequestData("", "5");
        addUseCaseControl.execute(requestData2);

        System.out.println("Test Case 3: Invalid input (non-integer)");
        RequestData requestData3 = new RequestData("three", "5");
        addUseCaseControl.execute(requestData3);

        System.out.println("Test Case 4: Invalid input (both numbers empty)");
        RequestData requestData4 = new RequestData("", "");
        addUseCaseControl.execute(requestData4);

        System.out.println("Test Case 5: Invalid input (both non-integer)");
        RequestData requestData5 = new RequestData("three", "five");
        addUseCaseControl.execute(requestData5);
    }
}
