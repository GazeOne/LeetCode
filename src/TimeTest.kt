import java.util.*

object TimeTest {
    fun getTimeBeforeTomorrow(): Long {
        val curDate = Calendar.getInstance()
        curDate.set(Calendar.MONTH, 10)
        curDate.set(Calendar.DATE, 30)
        System.out.println("${curDate.get(Calendar.YEAR)}, ${curDate.get(Calendar.MONTH)}, ${curDate.get(Calendar.DATE)} }")

        val tomorrowDate = GregorianCalendar(curDate
                .get(Calendar.YEAR), curDate.get(Calendar.MONTH), curDate
                .get(Calendar.DATE) + 1, 0, 0, 0)
        System.out.println("${curDate.get(Calendar.YEAR)}, ${curDate.get(Calendar.MONTH)}, ${curDate.get(Calendar.DATE) + 1} }")
        return (tomorrowDate.timeInMillis - curDate.timeInMillis) / 1000
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(getTimeBeforeTomorrow())
    }
}