package com.valente
/**
 * Created by uq4n on 06/06/2016.
 */
import spock.lang.Specification

class DecentNumberSpec extends Specification {

    def "test 1"(int n, String result) {
        expect:
        DecentNumber.solve(n) == result

        where:
        n | result
        1 | "-1"
        3 | "555"
        5 | "33333"
        6 | "555555"
        9 | "555555555"
        11 | "55555533333"
        12 | "555555555555"
        15 | "555555555555555"

    }
}