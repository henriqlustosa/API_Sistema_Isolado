package censo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.AssessorExtratoDto;
import censo.model.Extrato;
@RestController
@RequestMapping("/hspmsgh-api/assessor/extratoperiodo")

public class AssessorExtratoController {
	@CrossOrigin(origins="*")
	@GetMapping()
	public ResponseEntity<List<Extrato>> getExtratoPorProntuario(String dataInicial, String dataFinal){
		
		List<Extrato> extrato = AssessorExtratoDto.Extrato(dataInicial, dataFinal);	
		
		//if(censo.getCd_prontuario() == null) {
		//	return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(extrato); 
	}
}
