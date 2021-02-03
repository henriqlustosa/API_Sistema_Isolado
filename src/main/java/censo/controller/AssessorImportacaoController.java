package censo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.AssessorImportacaoDto;

import censo.model.Paciente;
@RestController
@RequestMapping("/hspmsgh-api/assessor/importacao")

public class AssessorImportacaoController {
	@CrossOrigin(origins="*")
	@GetMapping()
	public ResponseEntity<List<Paciente>> getAssessorImportacao(String codigoInicial, String codigoFinal,String dataAlteracao){
		
		List<Paciente> pacientes = AssessorImportacaoDto.paciente(codigoInicial, codigoFinal, dataAlteracao);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(pacientes); 
	}

}
