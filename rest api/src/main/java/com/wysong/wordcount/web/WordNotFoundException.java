package com.wysong.wordcount.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when a word is not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class WordNotFoundException extends RuntimeException {
    public WordNotFoundException(String word) {
        super("could not find word '" + word + "'.");
    }
}
