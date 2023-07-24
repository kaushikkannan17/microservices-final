package com.example.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookDetailRepository bookDetailRepository;

    @PostMapping("/addBook")
    public ResponseEntity<String> addBookDetails(@RequestParam("isbn") Integer isbn, @RequestParam("title") String title, @RequestParam("publishedDate") String publishedDate, @RequestParam("totalCopies") Integer totalCopies, @RequestParam("issuedCopies") Integer issuedCopies, @RequestParam("author") String author){
        BookDetail bookDetail = new BookDetail();
        bookDetail.setId(isbn);
        bookDetail.setTitle(title);
        bookDetail.setPublishedDate(publishedDate);
        bookDetail.setTotalCopies(totalCopies);
        bookDetail.setIssuedCopies(issuedCopies);
        bookDetail.setAuthor(author);
        bookDetailRepository.save(bookDetail);
        return new ResponseEntity<>("Book details added successfully", HttpStatus.OK);
    }

    @GetMapping("/fetchBookDetails")
    public List<BookDetail> fetchAllBooks(){
        return bookDetailRepository.findAll();
    }

    @GetMapping("/fetchSingleBook")
    public Optional<BookDetail> fetchSingleBooks(@RequestParam("isbn") Integer isbn){
        return bookDetailRepository.findById(isbn);
    }

    @GetMapping("/deleteBook")
    public ResponseEntity<String> deleteBook(@RequestParam("isbn") Integer isbn){
        bookDetailRepository.deleteById(isbn);
        return new ResponseEntity<>("Deleted Book details successfully", HttpStatus.OK);
    }

    @GetMapping("/updateBook")
    public ResponseEntity<String> updateBookDetails(@RequestParam("isbn") Integer isbn, @RequestParam("title") String title, @RequestParam("publishedDate") String publishedDate, @RequestParam("totalCopies") Integer totalCopies, @RequestParam("issuedCopies") Integer issuedCopies, @RequestParam("author") String author){
        BookDetail bookDetail = new BookDetail();
        bookDetail.setId(isbn);
        bookDetail.setTitle(title);
        bookDetail.setPublishedDate(publishedDate);
        bookDetail.setTotalCopies(totalCopies);
        bookDetail.setIssuedCopies(issuedCopies);
        bookDetail.setAuthor(author);
        bookDetailRepository.save(bookDetail);
        return new ResponseEntity<>("Book details updated successfully", HttpStatus.OK);
    }

}
