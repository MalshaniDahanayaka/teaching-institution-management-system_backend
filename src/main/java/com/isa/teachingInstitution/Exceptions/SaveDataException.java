package com.isa.teachingInstitution.Exceptions;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class SaveDataException extends RuntimeException{
    public SaveDataException(String message) {
            super(message);
    }

    public SaveDataException(String message, Throwable cause) {

        super(message, cause);
    }
}
