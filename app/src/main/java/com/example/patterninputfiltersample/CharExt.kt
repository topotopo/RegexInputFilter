package com.example.patterninputfiltersample

import java.util.regex.Pattern

fun Char.isMatching(pattern: Pattern): Boolean {
    return this.toString().matches(pattern.toRegex())
}