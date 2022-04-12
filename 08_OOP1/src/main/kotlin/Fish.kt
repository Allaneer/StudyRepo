import kotlin.random.Random

open class Fish (
    name: String,
    energy: Int,
    age: Int,
    maxAge: Int,
    weight: Int
): Animal (name, energy, age, maxAge, weight) {
    override fun move() {
        if (energy >= 5 && weight >= 2) {
            energy -= 5; weight--
        } else return
        tryIncrementAge()
        println("$name плывёт")
    }

    override fun offspring(name: String, age: Int, maxAge: Int): Fish {
        val newBorn = Fish(
                name,
                (Random.nextInt(10) + 1),
                0,
                maxAge,
                (Random.nextInt(5) + 1)
                )
            println ("У рыбы ${name} появился детёныш")
        return newBorn

    }

}