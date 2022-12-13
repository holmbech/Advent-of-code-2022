fun main() {
    fun part1(input: List<String>): Int {
        var max = 0
        var temp = 0
        for (s in input) {
            if(s.isEmpty()) {
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
        return input.size
    }

    val input = readInput("Day01_test")
    println(part1(input))
    println(part2(input))

}
