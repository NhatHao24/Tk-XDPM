package com.l221404.Input;

import com.l221404.Database.RequestData;
import com.l221404.ResponseError; 
import com.l221404.Output.AddUIConsoleOutput;
import com.l221404.Usecase.AddUseCaseControl;
import java.util.Scanner;

public class AddUIConsoleInput {

    
    private AddUseCaseControl addUseCaseControl;
    private AddUIConsoleOutput addUIConsoleOutput;

   
    public AddUIConsoleInput() {
    
        this.addUIConsoleOutput = new AddUIConsoleOutput();
        this.addUseCaseControl = new AddUseCaseControl();
        this.addUseCaseControl.setAddUIConsoleOutput(addUIConsoleOutput);
    }

    
    public void start() {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Nhập số thứ nhất:");
        String number1 = scanner.nextLine();

        
        System.out.println("Nhập số thứ hai:");
        String number2 = scanner.nextLine();

       
        RequestData requestData = new RequestData(number1, number2); // Đảm bảo hàm khởi tạo đúng

       
        addUseCaseControl.execute(requestData);

       
        scanner.close();
    }

   
    public void showError(ResponseError error) {
       
       // System.err.println("Error: " + error.getContent()); // Đảm bảo ResponseError có phương thức getContent()
    }

    
    public void showResult(String result) {
       
        System.out.println("Kết quả: " + result);
    }

        public static void main(String[] args) {
        AddUIConsoleInput addUIConsoleInput = new AddUIConsoleInput();
        addUIConsoleInput.start();
    }
}
