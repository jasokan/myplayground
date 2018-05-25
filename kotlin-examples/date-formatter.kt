import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

fun main(args: Array<String>) {
    val dateString = "Aug 12, 2018"

    val dateFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH)
    val formattedDate = LocalDate.parse(dateString, dateFormatter)

    println(formattedDate)
}