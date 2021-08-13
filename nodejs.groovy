job('NodeJS Job') {
    scm {
        git('https://github.com/ostakashi777/devops_sample_nodejs.git') {  node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('ta-ko@xc5.so-net.ne.jp')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs_v12')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
