fun main() {
    fun part1(input: List<String>): Int {
        var max = 0
        var temp = 0
        for (s in input) {
            if (s.isEmpty()) {
                if (temp > max) {
                    max = temp
                }
                temp = 0
            } else {
                temp += s.toInt()
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        var temp = 0
        val caloriesList = ArrayList<Int>()
        for (s in input) {
            if (s.isNotEmpty()) {
                temp += s.toInt()
            } else {
                caloriesList.add(temp)
                temp = 0
            }
        }

        caloriesList.sort()

        println("caloriesList = ${caloriesList.joinToString(", ")}")

        return caloriesList.removeLast() + caloriesList.removeLast() + caloriesList.removeLast()
    }

    val input = readInput("Day01_test")
    println(part1(input))
    println(part2(input))

}
