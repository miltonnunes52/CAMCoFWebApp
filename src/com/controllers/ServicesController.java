@Controller
public class ServicesController {

 @RequestMapping("/services")
 public String execute() {
	 System.out.println("Executando a logica com Spring MVC");
     return "ok";
 }
 
}
