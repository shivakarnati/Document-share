package com.codefelix.document.dto.request;

import lombok.Data;

@Data
public class FileReqDto {

    private Long id;
    private String bucketName;
    private String keyName;
    private String versionId;
    private String type;


}
