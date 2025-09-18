fun main() {
    val quizPoint = 50
    val finalExamPoint = 70

    val passQuiz = quizPoint > 88
    val passFinalExam = finalExamPoint > 98

    val pass = passQuiz && passFinalExam

    println("you : $pass")
}