package io.jelyck.groovywordservice.word;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
public class WordController {

    @Autowired
    WordService service;

    @GetMapping("/palindrome")
    def isPalindrome(@RequestParam String word) {
        service.isPalindrome(word)
    }

    @PostMapping(value = "/anagram", consumes = "application/json")
    def isAnagram(@RequestBody Word word) {
        service.isAnagram(word.word1, word.word2)
    }

}