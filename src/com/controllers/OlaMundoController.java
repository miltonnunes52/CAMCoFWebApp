@Controller
public class OlaMundoController {

  @RequestMapping("/olaMundoSpring")
  public String execute() {
      System.out.println("Executando a logica com Spring MVC");
      return "ok";
  }
}