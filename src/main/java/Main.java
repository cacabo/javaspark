import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("In main method");

        int port = 4567;
        port(port);

        System.out.println("Listening on port " + port);

        get("/", (req, res) -> {
            res.type("text/html");
            res.status(200);
            return "<h1>This is the root</h1>";
        });

        get("/hello", (req, res) -> "Hello World");
        get("/*", (req, res) -> "This is the wildcard");
    }
}

