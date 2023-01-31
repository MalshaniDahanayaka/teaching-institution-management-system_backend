package com.isa.teachingInstitution.Exceptions;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class SaveDataException extends RuntimeException{
    public SaveDataException(MysqlxDatatypes.Scalar.String message) {
            super(message);
    }

    public SaveDataException(MysqlxDatatypes.Scalar.String message, Throwable cause) {

        super(message, cause);
    }
}
