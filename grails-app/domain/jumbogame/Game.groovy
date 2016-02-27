package jumbogame

import grails.rest.Resource


@Resource(formats = ['json'])
class Game {

    String name

    def hasMany = [
            answers: Answer,
            scores: Score
    ]

    Answer correctAnswer

    static constraints = {
    }
}
