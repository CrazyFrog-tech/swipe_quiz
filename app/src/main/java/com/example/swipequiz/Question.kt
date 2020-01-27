package com.example.swipequiz

data class Question(
    var question: String,
    var answer: String
) {
    companion object{
        val QUESTONS = arrayOf(
            "Who let the dogs out, who, who, who,",
            "The weather in the Netherlands is always bad",
            "People in the train are always checking their social media",
            "The Netherlands has a queen and she's called Biatrix",
            "I'm bored of school",
            "Building applications is more fun than other subjects"
        )

        val ANSWERS = arrayOf(
            "true",
            "true",
            "true",
            "false",
            "true",
            "true"
            )
    }
}