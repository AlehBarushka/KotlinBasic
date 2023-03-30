fun main() {
    //Логические операторы

    // Операторы сравнения
    // <, >, >=, <=, ==, !=

    //Операторы ссылочного сравнения
    // ===, !==

    // Логические операторы
    // &&, ||, !

    val userAge = 23
    val result = userAge >= MIN_AGE

    println("Результат проверки возраста: $result")

    var newResult = (userAge >= MIN_AGE) && (userAge <= MAX_AGE)

    println("Результат проверки возраста: $newResult")

    // Сокращённая и изящная запись
    var result_2 = userAge in MIN_AGE .. MAX_AGE

    println("Результат проверки возраста: $result_2")

    val a = true
    val b = !a

    println(b) // false

}

// константы в kotlin
const val MIN_AGE = 18
const val MAX_AGE = 62