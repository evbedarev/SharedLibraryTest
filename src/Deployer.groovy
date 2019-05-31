@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
import org.apache.commons.lang3.StringUtils

class Deployer {
    int tries = 0
    Script script

    Deployer(int tries) {
        this.tries = tries;
    }

    def run() {
        for (int i = 0; i < tries; i++) {
            Thread.sleep(5)
            tries++
            script.echo("tries is numeric: " + StringUtils.isAlphanumeric("" + tries))

        }
    }
}