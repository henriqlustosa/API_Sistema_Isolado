package censo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.AssessorCodigoLeitoDto;
import censo.model.Codigo;

@RestController
@RequestMapping("/hspmsgh-api/codigoLeito")

public class AssessorCodigoLeitoController {
	@CrossOrigin(origins="*")
	@GetMapping("/")
	ResponseEntity<List<Codigo>> getCensos(){
		
		List<Codigo> censos = AssessorCodigoLeitoDto.Censos();
		
		
		if(censos == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(censos);
	}
	
}
	