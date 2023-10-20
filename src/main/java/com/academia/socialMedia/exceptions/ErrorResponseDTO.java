package com.academia.socialMedia.exceptions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponseDTO {

    private String message;
    private String code;
    private String path;
    private String timeStamp;


}
