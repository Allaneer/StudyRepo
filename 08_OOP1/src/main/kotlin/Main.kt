import kotlin.random.Random

fun main() {

    print("Введите количество циклов для заповедника, ")
    var n: Int = -1
    while (n <= 0) {
        println("число должно быть положительным:")
        n = readLine()?.toIntOrNull() ?: return println("invalid n")
    }

    var reserve = NatureReserve(
        name = "Инициализация",
        energy = 0,
        age = 0,
        maxAge = 0,
        weight = 0
    )

    var newBornCitizens: MutableList<Animal> = mutableListOf()
    var candidatesToRemove: MutableList<Animal> = mutableListOf()

    val numbers = listOf(1, 2, 3, 4)
    var action: Int

    for (i in 1..n) {

        for (it in reserve.reserveCitizens) {
            action = numbers.random()
            if (it.isTooOld == true) {
                candidatesToRemove.add(it)
                println("Животное ${it.name} умерло")
            }

            if (action == 1) it.move()
            else if (action == 2) it.eat()
            else if (action == 3) it.sleep()
            else if (action == 4) {
                if (Random.nextBoolean() && (it.age <= (it.maxAge / 4)) == false)
                    newBornCitizens.add(it.offspring(it.name, it.age, it.maxAge))
            }
        }

        reserve.reserveCitizens.minusAssign(candidatesToRemove)
        candidatesToRemove.clear()

        reserve.reserveCitizens.addAll(newBornCitizens)
        newBornCitizens.clear()
        println("Количество животных в заповеднике после ${i} цикла - ${reserve.reserveCitizens.size}")



    }

}