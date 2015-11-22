package cat.enric612.sparkjava.exemple;

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class Main implements SparkApplication {
    @Override
    public void init(){
        get("/", (req, res) -> "Hola Penya!");
    }
}
