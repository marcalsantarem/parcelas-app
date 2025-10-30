package com.marcal.parcelas_backend.exception;

import java.time.LocalDateTime;

public class ApiErrorResponse {
	
	private int status;
	private String erro;
	private LocalDateTime timestamp;
	
	public ApiErrorResponse(int status, String erro, LocalDateTime timestamp) {
		this.status = status;
		this.erro = erro;
		this.timestamp = timestamp;
	}
	
    public int getStatus() { 
    	return status; 
    }
    
    public String getErro() { 
    	return erro; 
    }
    
    public LocalDateTime getTimestamp() { 
    	return timestamp; 
    }

}
