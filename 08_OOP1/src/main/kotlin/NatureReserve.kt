
open class NatureReserve (
    name: String,
    energy: Int,
    age: Int,
    maxAge: Int,
    weight: Int
): Animal (name, energy, age, maxAge, weight) {
    var reserveCitizens = mutableListOf(
        Bird("Голубь", 2, 10, 20, 7),
        Bird("Утка", 4, 20, 25, 4),
        Bird("Воробей", 3, 10, 11, 2),
        Bird("Сова", 1, 4, 6, 3),
        Bird("Ворона", 2, 100, 300, 6),
        Fish("Лещ", 6, 8, 15, 3),
        Fish("Щука", 7, 10, 20, 4),
        Fish("Осетр", 5, 13, 25, 6),
        Dog("Овчарка", 8, 16, 30, 9),
        Dog("Двор-терьер", 10, 17, 30, 8),
        Animal("Змея", 5, 41, 60, 3),
        Animal("Мышь", 10, 2, 3, 1),
        Animal("Заяц", 6, 12, 25, 7),
        Animal("Медведь", 50, 6, 80, 30)
    )

}