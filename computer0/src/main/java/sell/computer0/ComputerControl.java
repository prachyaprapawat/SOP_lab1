package sell.computer0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class ComputerControl {
	Lenovo lenovo = new Lenovo();
	Dell dell = new Dell();
	MAC mac = new MAC();
	
	@RequestMapping("/computer/lenovo")
    public String Apple(){
        return "ยี่ห้อ : "+lenovo.getBrand()+"รุ่น : "+lenovo.getGeneration()+" ราคา : "+lenovo.getPrice(); 
    }
@RequestMapping("/computer/dell")
public String Samsung(){
    return "ยี่ห้อ : "+dell.getBrand()+"รุ่น : "+dell.getGeneration()+" ราคา : "+dell.getPrice(); 
}
@RequestMapping("/computer/mac")
public String Huawei(){
	return "ยี่ห้อ : "+mac.getBrand()+"รุ่น : "+mac.getGeneration()+" ราคา : "+mac.getPrice(); 
}

	
}
