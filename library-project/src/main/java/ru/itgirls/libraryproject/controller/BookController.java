package ru.itgirls.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirls.libraryproject.dto.BookDto;
import ru.itgirls.libraryproject.service.BookService;

@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookService bookService;

    @GetMapping("/book")
    BookDto getByNameV1(@RequestParam(value = "name", required = false) String name) {
        return bookService.getByNameV1(name);
    }
    @GetMapping("/book/v2")
    BookDto getByNameV2(@RequestParam(value = "name", required = false) String name) {
        return bookService.getByNameV2(name);
    }

    @GetMapping("/book/v3")
    BookDto getByNameV3(@RequestParam(value = "name", required = false) String name) {
        return bookService.getByNameV3(name);

    }
}
