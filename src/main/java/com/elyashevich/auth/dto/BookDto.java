package com.elyashevich.auth.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    @NotEmpty(message = "Title should not be empty!")
    private String title;

    @NotEmpty(message = "Description should not be empty!")
    private String description;

    @NotEmpty(message = "Author id should not be empty!")
    private Long authorId;

    @NotEmpty(message = "Publisher id should not be empty!")
    private Long publisherId;

    @NotEmpty(message = "Genre id should not be empty!")
    private Long genreId;

    @NotEmpty(message = "Page count should not be empty!")
    private Integer pageCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookDto bookDto = (BookDto) o;

        if (!Objects.equals(title, bookDto.title)) return false;
        if (!Objects.equals(description, bookDto.description)) return false;
        if (!Objects.equals(authorId, bookDto.authorId)) return false;
        if (!Objects.equals(publisherId, bookDto.publisherId)) return false;
        if (!Objects.equals(genreId, bookDto.genreId)) return false;
        return Objects.equals(pageCount, bookDto.pageCount);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (authorId != null ? authorId.hashCode() : 0);
        result = 31 * result + (publisherId != null ? publisherId.hashCode() : 0);
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (pageCount != null ? pageCount.hashCode() : 0);
        return result;
    }
}
