package com.l221404.Output;

import com.l221404.ResponseError;
import com.l221404.Database.ResponseData;

public interface OutputBoundary {

    void showError(ResponseError error);
    void showResult(ResponseData responseData);

}
