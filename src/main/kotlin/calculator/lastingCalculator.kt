package smart.calculator

import java.util.Scanner

const val EXIT_COMMAND = "/exit"
const val BYE = "Bye!"

val add: (String) -> Int = {
    val sc = Scanner(it)
    sc.nextInt() + sc.nextInt().also { sc.close() }
}

fun main() {
    val sc = Scanner(System.`in`)
    var line = sc.nextLine()

    while (!line.equals(EXIT_COMMAND, ignoreCase = true)) {
        if (line.isNotBlank()) {
            if (line.matches(Regex("-?\\d+"))) {
                println(line)
            } else {
                println(add(line))
            }
        }
        line = sc.nextLine()
    }

    println(BYE)
}