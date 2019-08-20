#!groovy
package customlib;

import org.jenkinsci.plugins.docker.workflow.*;
import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.common.StandardUsernameCredentials;
import com.cloudbees.plugins.credentials.domains.URIRequirementBuilder;
import hudson.security.ACL;
import groovy.json.JsonSlurper;
import groovy.json.JsonOutput;

class JenkinsLibrary implements Serializable {
    def steps
    def scripts
    def value = "Hola mundo!!!"
    
    JenkinsLibrary(steps, script){
        this.steps = steps
        this.script = script
    }

    def showValue(){
        println value;
        steps.echo "showValue"
    }
}