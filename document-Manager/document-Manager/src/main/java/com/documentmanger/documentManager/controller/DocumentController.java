package com.documentmanger.documentManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.documentmanger.documentManager.model.Doc;
import com.documentmanger.documentManager.repository.Docrepository;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DocumentController {

	@Autowired
	  private Docrepository docrepo;
	  @PostMapping("/adddoc")
		public Doc adddoc(@RequestBody Doc d) {
			return docrepo.save(d);
		} 
	  
	  @GetMapping("/getdoc")
		public List<Doc> getdocs(){
			return docrepo.findAll();
		}
}
