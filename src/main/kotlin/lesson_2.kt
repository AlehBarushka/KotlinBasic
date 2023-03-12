fun main() {
    val a = 5
    val b = 7
    val sum = a + b
    println(sum)
// println(a + b)

// Int
    val intNumber1 = 100
    val intNumber2 = 45
    println(intNumber1 / intNumber2)

// Float
    val floatNumber1: Float = 10f
    val floatNumber2: Float = 3f
    println(floatNumber1 / floatNumber2)

// Double
    val doubleNumber1 = 10.0
    val doubleNumber2 = 3.0
    println(doubleNumber1 / doubleNumber2)

// Отсаток от деления
    println(10 % 2)

// Конечный тип данных
    val c = intNumber1 + floatNumber1
    println(c::class.simpleName)
    // будет тип float

    val d = intNumber2 + floatNumber1 + doubleNumber2
    println(d::class.simpleName)
    // будет тип double

// Инкремент, декремент

    var couner = 1

    couner = couner + 1
    couner += 1
    couner++
    ++couner

    println(couner)

    couner -= 1
    couner--
    --couner

    println(couner)

// Сравнение

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

}