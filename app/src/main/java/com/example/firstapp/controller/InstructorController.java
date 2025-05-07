package com.example.firstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstapp.model.Instructor;

@RestController
@RequestMapping("instructor")
public class InstructorController extends CRUDController<Integer, Instructor> {

	public InstructorController() {
		Instructor carnis = new Instructor("carnis",15012,"ECommerce");
		Instructor maria = new Instructor("maria",15065,"WebServices");
		Instructor alex = new Instructor("alex",15098,"SQA");
		
		getMap().put(15012, carnis);
		getMap().put(15065, maria);
		getMap().put(15098, alex);
	}
}