package hometasks.operators

import java.util.regex.Pattern

class PatternFindMatchOperators {

    static void main(String[] args) {

        def text = "Test string for testing"
        def strictText = "test string"
        // The pattern operator (~) provides a simple way to create a java.util.regex.Pattern instance
        // Pattern operator
        def patternA = ~/test/
        println((~/test/).getClass())
        def patternB = ~"test"
        println (~"test").getClass()
        def patternC = ~'test'
        def patternD = ~"${patternC}"
        def patternE = ~"Not exists"

        println("Find operator !!!")
        findByPattern(patternA, text)
        findByPattern(patternB, text)
        findByPattern(patternC, text)
        findByPattern(patternD, text)
        findByPattern(patternE, text)
        println("End Find operator !!!")

        println("Find operator !!!")
        findByPattern(patternA, strictText)
        findByPattern(patternB, strictText)
        findByPattern(patternC, strictText)
        findByPattern(patternD, strictText)
        findByPattern(patternE, strictText)
        println("End Find operator !!!")

        println("Match operator !!!")
        strictMatchByPattern(patternA, strictText)
        strictMatchByPattern(patternB, strictText)
        strictMatchByPattern(patternC, strictText)
        strictMatchByPattern(patternD, strictText)
        strictMatchByPattern(patternE, strictText)
        println("End Match operator !!!")
    }

    static def findByPattern(Pattern pattern, String testString){
        // use the find operator =~ to directly create a java.util.regex.Matcher instance
        // Find operator
        def matcher = testString =~ pattern
        println matcher.count
        if (!matcher) {
            println("Oops, ${matcher} not found!")
        }
    }

    static def strictMatchByPattern(Pattern pattern, String testString){
        // The match operator (==~) is a slight variation of the find operator, that returns a boolean
        // and requires a strict match of the input string
        // Match operator
        def isMatched = testString ==~ pattern
        println isMatched
        if (!isMatched) {
            println("Oops, ${pattern} not found!")
        }

    }
}