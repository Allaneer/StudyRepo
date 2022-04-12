import kotlin.random.Random

open class Animal(
    val name: String,
    var energy: Int,
    var age: Int,
    val maxAge: Int,
    var weight: Int
) {
    var isTooOld = false
        set(value) {
            field = when {
                age >= maxAge -> true
                else -> false
            }
        }

    fun sleep() {
        isTooOld = true
        energy += 5
        if (isTooOld == true) return
        else age++
        println("$name спит")
    }

    fun eat() {
        energy += 3
        weight++
        tryIncrementAge()
        println("$name ест")
    }

    open fun move() {
        if (energy >= 5 && weight >= 2) {
            energy -= 5; weight--
        } else return
        tryIncrementAge()
        println("$name передвигается")
    }

    fun tryIncrementAge() {
        isTooOld = true
        if (Random.nextBoolean() && isTooOld == false) age++
        else return
    }

    open fun offspring(name: String, age: Int, maxAge: Int): Animal {
            val newBorn = Animal(
                name,
                (Random.nextInt(10) + 1),
                0,
                maxAge,
                (Random.nextInt(5) + 1)
            )
            println("У животного ${name} появился детёныш")
            return newBorn
    }
}





