package jumbogame

import grails.rest.Resource

@Resource(formats=['json'])
class Score {

    String seat = ''
    Integer value = 0

    static constraints = {
    }
}
