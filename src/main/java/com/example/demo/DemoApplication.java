package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Author pushkin = new Author("Alexandr Pushkin");
		Author ernest = new Author("Ernest Hemenguey");
		Book onegin = new Book(pushkin,"Evgeniy Onegin", 267, 1833);
		Book dochka = new Book(pushkin, "Kapitanskaya dochka", 189, 1836);
		Book staric = new Book(ernest, "Staric i more", 57, 1952);
		Book colocol = new Book(ernest, "Po kom zvonit colocol", 647, 1940);
		Book[] lib = {onegin, dochka, staric, colocol};

		System.out.println("all books:");
		for(int i = 0; i < lib.length; i++){
			System.out.println(lib[i].name);
		}
		System.out.println(" ");
		System.out.println("Pushkin's books:");
		for(int i = 0; i < lib.length; i++){
			if(lib[i].author==pushkin){
				System.out.println(lib[i].name);
			}
		}
		System.out.println(" ");
		System.out.println("Ernest's books:");
		for(int i = 0; i < lib.length; i++){
			if(lib[i].author==ernest){
				System.out.println(lib[i].name);
			}
		}
	}

}
