package com.react.Controller;

import com.react.Entity.Art;
import com.react.Service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/art")
@CrossOrigin
public class ArtController {
    @Autowired
    private ArtService artService;

    @PostMapping("/save")
    public ResponseEntity<Art> saveArt(@RequestBody Art art) {
        return new ResponseEntity<>(artService.saveArt(art), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Art>> getAllArt() {
        List<Art> arts = artService.getAllArt();
        return new ResponseEntity<>(arts, HttpStatus.OK);
    }

    @GetMapping("/getAll/{id}")
    public ResponseEntity<Optional<Art>> getById(@PathVariable int id) {
        return new ResponseEntity<>(artService.getById(id), HttpStatus.ACCEPTED);

    }

    @GetMapping("/getAll/category/{category}")
    public ResponseEntity<List<Art>> findBycategory(@PathVariable String category) {
        return new ResponseEntity<>(artService.findByCategory(category), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAll/authorName/{authorName}")
    public ResponseEntity<List<Art>> findByauthorName(@PathVariable String authorName) {
        return new ResponseEntity<>(artService.findByAuthorName(authorName), HttpStatus.ACCEPTED);
    }
}
