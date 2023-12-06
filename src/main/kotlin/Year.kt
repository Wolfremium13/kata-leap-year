class Year {
    companion object {
        fun isLeapYear(year: Int): Boolean {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return false
                }
                return true
            }
            return false
        }
    }

}
