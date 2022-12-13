fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // ABC  XYZ  Rock(1), Paper(2), Scissor(3) - loose 0, draw 3, win 6

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day02_test")
    //check(part1(testInput) == 1)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))

}
