package com.elyashevich.auth.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenreDto {

    @NotEmpty(message = "Title should not be empty!")
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreDto genreDto = (GenreDto) o;

        return Objects.equals(title, genreDto.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
