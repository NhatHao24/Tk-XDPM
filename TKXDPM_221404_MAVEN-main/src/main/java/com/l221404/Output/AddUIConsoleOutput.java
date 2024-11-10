package com.l221404.Output;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import com.l221404.ResponseError;
import com.l221404.Database.ResponseData;

public class AddUIConsoleOutput implements OutputBoundary {
    private ResponseError error = null;
    private String ketQua; 

    public AddUIConsoleOutput() {
        // Optional: initialize output stream, if needed
        // PrintWriter stdOut = new PrintWriter(new OutputStreamWriter(System.out));
    }

   
    public void showResult(ResponseData responseData) {
        if (responseData != null) {
            System.out.println("Result: " + responseData.toString()); // Adjust according to the ResponseData structure
        } else {
            System.out.println("No data to display.");
        }
    }

    
    public void showError(ResponseError error) {
        this.error = error;
        //System.err.println("Error: " + error.getNoiDung()); // Adjust "getNoiDung" method if it's different
    }

   
    public ResponseError getError() {
        return error;
    }

    
    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    
    public void displayResult() {
        if (ketQua != null) {
            System.out.println(ketQua);
        } else {
            System.out.println("No result to display.");
        }
    }

   
    public void displayError(ResponseError error) {
       // System.err.println("Lỗi: " + error.getNoiDung()); // Vietnamese for "Error:"
    }
}
