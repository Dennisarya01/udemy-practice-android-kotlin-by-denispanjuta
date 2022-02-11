package denis.tutorial.quizapp.model

data class Question(
    val id: Int,
    val questions: String,
    val image: Int,
    val optionsOne: String,
    val optionsTwo: String,
    val optionsThree: String,
    val optionsFour: String,
    val correctAnswer: Int
)