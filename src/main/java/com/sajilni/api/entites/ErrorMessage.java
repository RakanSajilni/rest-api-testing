package com.sajilni.api.entites;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class ErrorMessage {
    private String errorMessage;
    private HttpStatus statusCode;
    private String documentation;

    public ErrorMessage(String errorMessage, HttpStatus statusCode, String documentation) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.documentation = documentation;
    }
}
