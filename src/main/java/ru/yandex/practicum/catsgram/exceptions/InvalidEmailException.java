package ru.yandex.practicum.catsgram.exceptions;

public class InvalidEmailException extends Throwable {
    public InvalidEmailException(String message) {
        super(message);
    }
}
