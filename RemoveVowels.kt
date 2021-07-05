fun main() {
    println(removeVowels("Hello How are you doing"))
}
fun removeVowels(s: String): String {
    val result = StringBuilder()
    for (c in s) {
if (c != 'A' && c != 'a'
    && c != 'E' && c != 'e'
    && c != 'I' && c != 'i'
    && c != 'O' && c != 'o'
    && c != 'U' && c != 'u') {
    result.append(c)
   }
}
    return result.toString()
}