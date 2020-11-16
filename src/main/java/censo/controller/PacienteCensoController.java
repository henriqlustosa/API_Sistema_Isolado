package censo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import censo.controller.dto.CensoPacienteDto;
import censo.model.Censo;

@RestController
@RequestMapping("/hspmsgh-api/paciente")
public class PacienteCensoController {
	
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<Censo> getPacientePorProntuario(@PathVariable Long prontuarioId){
		
		Censo censo = CensoPacienteDto.Censos(prontuarioId);	
		
		if(censo.getCd_prontuario() == null) {
			return ResponseEntity.notFound().build();			
		}
		return ResponseEntity.ok(censo); 
	}

}
