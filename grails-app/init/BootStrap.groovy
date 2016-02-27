import jumbogame.Answer
import jumbogame.Game

class BootStrap {

    def init = { servletContext ->
        if (!Game.findByName('Shell')) {

            def correctAnswer = new Answer(name: 'Shell 1', value: 1).save(failOnError: true)

            def shellGame = new Game(
                    name: 'Shell',
                    answers: [
                            correctAnswer,
                            new Answer(name: 'Shell 2', value: 2),
                            new Answer(name: 'Shell 3', value: 3)
                    ],
                    scores: [],
                    correctAnswer: correctAnswer
            )

            shellGame.save(failOnError: true, flush: true)
        }
    }
    def destroy = {
    }
}
