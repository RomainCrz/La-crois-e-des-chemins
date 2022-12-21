public class Main {
    private final static String [] INPUT = {
            "/home/josh/project/app/src/index.js",
            "/home/peter/.bashrc",
            "/home/josh/project/app/images/logol.png",
            "/home/josh/project/app/images/logo2.png",
            "/home/peter/.profile",
            "/home/peter/test",
            "/var/log",
            "/us/lib/node14",
            "/home/josh/project/app/test.jpg",
            "/home/josh/project/app/images/logo3.png",
            "/opt/apache2",
            "/etc/hosts",
    };


    public static void main(String[] args)
    {
        Parser parser = new Parser("UNIX");
        parser.parse(INPUT);
    }
}