package com.l221404.Usecase;

import com.l221404.Database.RequestData;
import com.l221404.ResponseError;  
import com.l221404.Output.AddUIConsoleOutput;

public class AddUseCaseControl {

    private AddUIConsoleOutput addUIConsoleOutput;

    public void setAddUIConsoleOutput(AddUIConsoleOutput addUIConsoleOutput) {
        this.addUIConsoleOutput = addUIConsoleOutput;
    }

    public void execute(RequestData requestData) {
        ResponseError error = validateInput(requestData);
        if (error != null) {
            //addUIConsoleOutput.setLỗi(error);  
            return;
        }

        try {
            int number1 = Integer.parseInt(requestData.getStrNumber1());
            int number2 = Integer.parseInt(requestData.getStrNumber2());
            int result = number1 + number2;
            //addUIConsoleOutput.setKếtQuả("Result: " + result);  
        } catch (NumberFormatException e) {
            ResponseError parseError = new ResponseError("Invalid input. Please enter valid numbers.");
            //addUIConsoleOutput.setLỗi(parseError);  
        }
    }

    private ResponseError validateInput(RequestData requestData) {
        if (requestData.getStrNumber1().isEmpty() || requestData.getStrNumber2().isEmpty()) {
            return new ResponseError("Both numbers are required.");
        }

        try {
            Integer.parseInt(requestData.getStrNumber1());
            Integer.parseInt(requestData.getStrNumber2());
        } catch (NumberFormatException e) {
            return new ResponseError("Both inputs must be valid integers.");
        }

        return null;
    }
}
