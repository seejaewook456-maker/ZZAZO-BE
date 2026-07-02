package org.example.zzazo.global.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HealthResponseDto {

    @Schema(example = "UP")
    private String status;

    @Schema(example = "Server is running")
    private String message;
}
