package com.kwalit.error;

import java.util.Set;

public class CarUnSupportedFieldPatchException extends RuntimeException {

    public CarUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
