package censo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import censo.controller.dto.PacienteDto;
import censo.model.Paciente;

@RestController
@RequestMapping("/hspmsgh-api/assessor/paciente")
public class AssessorPacienteController {
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<Paciente> getPacientePorProntuario(@PathVariable Long prontuarioId){
		
		Paciente paciente = PacienteDto.paciente(prontuarioId);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(paciente); 
	}


}
