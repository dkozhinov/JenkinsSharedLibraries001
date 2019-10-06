package tools

class EchoClass {
    static def printEcho(script, text) {
        script.sh "Echo from EchoClass method printEcho = ${text}"
    }
}

