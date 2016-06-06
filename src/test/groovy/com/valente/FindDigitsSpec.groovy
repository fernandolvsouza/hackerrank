package com.valente
/**
 * Created by uq4n on 06/06/2016.
 */
import spock.lang.Specification

class FindDigitsSpec extends Specification {

    def "test "(int n, int result) {
        expect:
        FindDigits.solve(n) == result

        where:
        n | result
        12 | 2
        1012 | 3
    }
}