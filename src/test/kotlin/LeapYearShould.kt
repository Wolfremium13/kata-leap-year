import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LeapYearShould {
    @Test
    fun `not be a leap year`() {
        assertThat(Year.isLeapYear(1999)).isFalse()
    }

    @Test
    fun `be a leap year when is a typical common year`() {
        assertThat(Year.isLeapYear(2020)).isTrue()
    }

}