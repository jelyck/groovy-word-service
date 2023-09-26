package io.jelyck.groovywordservice.word;

import org.springframework.stereotype.Service;

@Service
public class WordService {

    def isPalindrome(String word) {
        word.toLowerCase() == word.toLowerCase().reverse() 
    }

    def isAnagram(word1, word2) {
        word1.split('').sort() == word2.split('').sort()
    }

}