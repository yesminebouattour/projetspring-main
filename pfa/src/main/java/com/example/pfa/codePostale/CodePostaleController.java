package com.example.pfa.codePostale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class CodePostaleController {
    private final CodePostaleService codePostaleService;
    @Autowired
    public CodePostaleController(CodePostaleService codePostaleService) {
        this.codePostaleService = codePostaleService;
    }
    @PostMapping("codesPostales/")
    public CodePostale addCodePostale(@RequestBody CodePostale codePostale){
        codePostaleService.addCodePostale(codePostale);
        return codePostale;
    }
    @GetMapping("codesPostales/")
    public List<CodePostale> getcodesPostales(){
        return codePostaleService.getCodesPostales();
    }
    @GetMapping("codesPostales/{id}")
    public CodePostale getCodePostale(@PathVariable Long id){
        return codePostaleService.getCodePostale(id);
    }
    @GetMapping("codesPostales/delete/{id}")
    public void deleteCodePostale(@PathVariable("id") Long id){
        codePostaleService.deleteCodePostale(id);
    }

}
