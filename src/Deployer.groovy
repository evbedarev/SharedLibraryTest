@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
import org.apache.commons.lang3.StringUtils

class Deployer {
    int tries = 0
    Script script

    Deployer(Script script, int tries) {
        this.tries = tries;
        this.script = script;
    }

    def run() {
        for (int i = 0; i < tries; i++) {
            Thread.sleep(5)
            tries++
            script.echo("tries is numeric: " + StringUtils.isAlphanumeric("" + tries))

        }
    }
}