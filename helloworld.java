//Try to get webhood to trigger a build when there is a change in code
//Try two
// turned of ssl on webhood on bigbucket side to see if webhood will quit having the Missing XSRF token
// added maven to build the code. let's see if by a miracle of no maven configuration, if bamboo can actually build this.

// push to github for jenkins trigger build test
// and again
// try again - change webhook to https from http and left SSL verify on
// try again - turn off SSL verify
// try again - Config Global Sec Jenkins Manage > turn off CSRF protection
// try again - adding a secret in github webhook secret field - 007 a change

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
