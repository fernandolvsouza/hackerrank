package com.valente
/**
 * Created by uq4n on 06/06/2016.
 */

import spock.lang.*

class UtupianTreeSpec extends Specification {

    def "test "(int cycles, int result) {
        expect:
        UtopianTree.solve(cycles) == result

        where:
        cycles | result
        0 | 1
        1 | 2
        4 | 7
    }
}