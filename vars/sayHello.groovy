
def call(String name = 'human') {
    echo "Hello, ${name}."
    new EchoClass().printEcho(name)
}