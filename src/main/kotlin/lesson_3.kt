fun main() {

    // Конкатенация строк
    val greeting = "Привет"
    val space = ' '
    val userName = "Звёздный Лорд"

    println(greeting + ", " + userName + "!" + space + "Какой будет ваш главный вопрос?")

    // Интерполяция строк (шаблонные строки)
    println("$greeting, $userName! Какой будет ваш главный вопрос?")
    println("Вот как работает сложение 40 + 20 = ${40 + 20}")

    // Многострочная запись
    val multiString = """
                   строка 1 
             строка 2
                    строка 3
    """.trimIndent()

    val multiStringWithMargin = """
             |строка 1 
              |строка 2
           |строка 3
    """.trimMargin()

    println(multiString)
    println(multiStringWithMargin)

}