node {
    stage("checkout"){
        git 'https://github.com/eitang14/first-github-repo.git'
    }
    stage("install requirements"){
        sh "pip install -r requirements.txt"
    }
    stage("run script"){
        sh "python 4.py"
    }
}
