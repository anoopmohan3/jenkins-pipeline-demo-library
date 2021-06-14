def call() {
    node {
      sh '''
        echo "hello............................................"
        git version
        docker version
        dotnet --list-sdks
        dotnet --list-runtimes
        echo "hello"
      '''
    }
}
