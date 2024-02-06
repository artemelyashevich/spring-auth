package com.elyashevich.auth.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Getter
@Setter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenreDto {

    @NotEmpty(message = "Title should not be empty!")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreDto genreDto = (GenreDto) o;

        return Objects.equals(name, genreDto.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
