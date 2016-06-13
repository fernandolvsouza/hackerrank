package com.valente
/**
 * Created by uq4n on 06/06/2016.
 */
import spock.lang.Specification


class TimeInWordsSpec extends Specification {

    def "test"(int h, int m, String result) {
        expect:
        TimeInWords.solve(h,m) == result

        where:
        h | m | result
        5 | 0 | "five o' clock"
        5 | 1 | "one minutes past five"
        5 | 10 | "ten minutes past five"
        5 | 15 | "quarter past five"
        5 | 30 | "half past five"
        5 | 40 | "twenty minutes to six"
        5 | 45 | "quarter to six"
        5 | 47 | "thirteen minutes to six"
        5 | 28 | "twenty eight minutes past five"
    }
}