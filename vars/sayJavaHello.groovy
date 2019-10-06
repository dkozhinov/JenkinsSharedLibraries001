import tools.JavaHello
@Grab(JavaHello)

def call(String name) {

    JavaHello  javaHello = new JavaHello("Dmitry")
    javaHello.say()
}