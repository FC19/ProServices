package server;

import controllers.SaludoController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.BooleanHelper;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {
    private static HandlebarsTemplateEngine engine;

    private static void initEngine() {
        Router.engine = HandlebarsTemplateEngineBuilder
                .create()
                .withDefaultHelpers()
                .withHelper("isTrue", BooleanHelper.isTrue)
                .build();
    }

    public static void init() {
        Router.initEngine();
        Spark.staticFileLocation("/public");
        Router.configure();
    }

    private static void configure(){
        SaludoController greetController = new SaludoController();

        //METODOS HTTP GET, POST, PUT, DELETE
        //Spark.get("/greet", (req, res) -> "Hola franco");
        //Spark.get("/greet", greetController::greet);
        //Spark.get("/greet/:name", greetController::greet2);
        //Spark.get("/greet/*/:name", (req,res) -> "Hola "+ req.splat()[0]+ " "+req.params("name"));
        //Spark.get("/greet/:name/:lastname", (req, res) -> "Hola "+req.params("lastname")+ " "+req.params("name"));
        //Spark.get("/greet", (req, res) -> "Hola "+req.queryParams("name") + " "+req.queryParams("lastname"));

        //Spark.get("/provider/:id", prestadorController::show, Router.engine);
    }
}
