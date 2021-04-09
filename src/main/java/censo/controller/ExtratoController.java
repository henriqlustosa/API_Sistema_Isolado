package censo.controller;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import censo.controller.dto.ExtratoDto;

import censo.model.Extrato;

@RestController
@RequestMapping("/hspmsgh-api/assessor/extrato")
public class ExtratoController {
	
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<List<Extrato>> getExtratoPorProntuario(@PathVariable Long prontuarioId){
		
		List<Extrato> extrato = ExtratoDto.Extrato(prontuarioId);	
		
		//if(censo.getCd_prontuario() == null) {
		//	return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(extrato); 
	}

}

