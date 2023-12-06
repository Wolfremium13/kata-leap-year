import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LeapYearShould {
    @Test
    fun `not be a leap year`() {
        assertThat(Year.isLeapYear(1999)).isFalse()
    }

}