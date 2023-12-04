package com.cg.trg.boot.exceptions;

public class DuplicateOrderFoundException extends RuntimeException {

	public DuplicateOrderFoundException(String message) {
		super(message);
	}
}
