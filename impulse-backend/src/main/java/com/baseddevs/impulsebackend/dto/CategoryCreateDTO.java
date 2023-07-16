package com.baseddevs.impulsebackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public record CategoryCreateDTO(
        @NotBlank(message = "Category name cannot be blank/null")
        @Size(min = 1, max = 100, message = "Category name must be between 1 and 100 characters") String name
) {

}