import java.math.BigDecimal
import java.util.*
import kotlin.math.pow


tailrec fun convertFromDecimal(rest: Long, base: Int, result: List<String>): List<String> {
    return if (rest < base) {
        result + rest.toString(base)
    } else {
        val remainder = rest % base
        val quotient = rest / base
        convertFromDecimal(quotient, base, result + remainder.toString(base))
    }
}

fun convertFromDecimal(number: Long, base: Int): String {
    return convertFromDecimal(number, base, emptyList())
        .reversed()
        .joinToString("") { it }
}

fun convertFractionalFromDecimal(fractional: BigDecimal, base: Int): String {
    val result = mutableListOf<String>()
    var remaining  = fractional
    var precision = 1
    while (precision <= 5 && remaining.compareTo(BigDecimal.ZERO) != 0) {
        remaining = remaining.multiply(base.toBigDecimal())
        val integerPart = remaining.toInt()
        if (integerPart > 0) {
            result.add(integerPart.toString(base))
            remaining = remaining.subtract(integerPart.toBigDecimal())
        } else {
            result.add(0.toString())
        }
        precision+=1
    }
    while(precision <= 5) {
        result.add("0")
        precision+=1;
    }
    return result.joinToString("") { it.toString() }
}

fun convertToDecimal(number: String, base: Int): Long {
    return number.lowercase(Locale.getDefault()).reversed().mapIndexed {
            i, c -> (Integer.valueOf(c.toString(), base) * base.toDouble().pow(i)).toLong()
    }.sum()
}

fun convertFractionalToDecimal(factional: String, base: Int): String {
    return factional.lowercase(Locale.getDefault()).mapIndexed { i, c ->
        val number = Integer.valueOf(c.toString(), base)
        if (number == 0) {
            number.toBigDecimal()
        } else {
            (number * base.toDouble().pow(-(i+1))).toBigDecimal()
        }
    }.reduceRight(BigDecimal::add).toString()
}

fun convert(number: String, source: Int, target: Int): String {
    return try {
        if (number.contains('.')) {
            val (integer, fractional) = number.split(".")
            val decimalInteger = convertToDecimal(integer, source)
            val convertedInteger = convertFromDecimal(decimalInteger, target)
            val decimalFractional = convertFractionalToDecimal(fractional, source)
            val convertedFractional = convertFractionalFromDecimal(BigDecimal(decimalFractional), target)
            "$convertedInteger.$convertedFractional"
        } else {
            val decimal = convertToDecimal(number, source)
            convertFromDecimal(decimal, target)
        }
    } catch (e: Throwable) {
        "Exception raised trying to convert $number from base $source to base $target"
    }
}

fun convert(source: Int, target: Int) {
    while (true) {
        print("Enter number in base ${source} to convert to base $target (To go back type /back) ")
        val input = readLine()!!
        if (input == "/back") {
            break
        } else {
            if (source == target) {
                if (input.contains(".")) {
                    val (integer, fractional) = input.split(".")
                    println("Conversion result: $integer.${fractional.substring(0, 5)}")
                } else {
                    println("Conversion result: $input")
                }
            } else {
                val result = convert(input, source, target)
                println("Conversion result: $result")
            }
            println()
        }
    }
}

fun main() {
    while (true) {
        print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ")
        val input = readLine()!!
        if (input == "/exit") {
            break
        } else {
            val (source, target) = input.split(" ").map { it.toInt() }
            convert(source, target)
        }
    }
}

