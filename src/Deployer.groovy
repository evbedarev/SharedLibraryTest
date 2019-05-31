@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
import org.apache.commons.lang3.StringUtils

class Deployer {
    int tries = 0
    Script script

    Deployer(Script script, def tries) {
        if (tries.isInteger()) {
            this.tries = tries as int;
        } else {
            this.tries = 0;
        }
        this.script = script;
    }

    def run () {
        File file = new File("/var/jenkins_home/workspace/loggroovy.txt");
        def logtext;
        for (int i = 0; i < tries; i++) {
            Thread.sleep(5);
            logtext = this.toString() + "tries is numeric: " + StringUtils.isAlphanumeric("" + tries);
            script.echo(logtext);
            file.append(logtext);
        }
    }
}