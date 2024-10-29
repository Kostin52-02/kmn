import kotlin.random.Random

fun main() {
    val options = arrayOf("Камень", "Ножницы", "Бумага")

    while (true) {

        val computerChoice = Random.nextInt(1, 4)
        println("Компьютер выбрал: ${options[computerChoice - 1]}")


        println("Введите ваш выбор (1 - Камень, 2 - Ножницы, 3 - Бумага):")
        val playerChoice = readlnOrNull()?.toIntOrNull()


        if (playerChoice !in 1..3) {
            println("Ошибка: введите номер от 1 до 3!")
            continue
        }


        if (playerChoice != null) {
            println("Вы выбрали: ${options[playerChoice - 1]}")
        }


        when {
            playerChoice == computerChoice -> {
                println("Ничья! Игра переигрывается.\n")
            }
            (playerChoice == 1 && computerChoice == 2) ||
                    (playerChoice == 2 && computerChoice == 3) ||
                    (playerChoice == 1 && computerChoice == 3) -> {
                println("Вы победили!\n")
            }
            else -> {
                println("Компьютер победил!\n")
            }
        }
    }
}
