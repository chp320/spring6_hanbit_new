package com.example.shopping.s_0002_common.exception;

@SuppressWarnings("serial")
public class StockShortageException extends RuntimeException {
    public StockShortageException(String msg) {
        super(msg);
    }
}
