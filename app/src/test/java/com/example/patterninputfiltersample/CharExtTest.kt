package com.example.patterninputfiltersample

import org.junit.Test

class CharExtTest {

    @Test
    fun `char is matching regex`() {
        val matchingRegex = 'a'
        val notMatchingRegex = '~'
        val weirdLettersRegex = 'ï'

        assert(matchingRegex.isMatching(REGEX_1.toPattern()))
        assert(!notMatchingRegex.isMatching(REGEX_1.toPattern()))
        assert(!weirdLettersRegex.isMatching(REGEX_1.toPattern()))

        //Usage of {Alnum}
        assert(matchingRegex.isMatching(REGEX_2.toPattern()))
        assert(!notMatchingRegex.isMatching(REGEX_2.toPattern()))
        assert(!weirdLettersRegex.isMatching(REGEX_2.toPattern()))

        //Usage of {L}
        assert(matchingRegex.isMatching(REGEX_3.toPattern()))
        assert(!notMatchingRegex.isMatching(REGEX_3.toPattern()))
        assert(weirdLettersRegex.isMatching(REGEX_3.toPattern()))
    }
}