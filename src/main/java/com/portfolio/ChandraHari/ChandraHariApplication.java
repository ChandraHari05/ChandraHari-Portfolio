package com.portfolio.ChandraHari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ChandraHariApplication {

	public static void main(String[] args) { //congigure for configuration . driectory ./ showing root file .incase syntax mistake error ignoremal ingore incase missing env load is used to load the file and all env files save in dotenv
		Dotenv dotenv = Dotenv.configure().directory("./").ignoreIfMalformed().ignoreIfMissing().load();
		//to check the value are present and we have to set so we use this method // check the env is avail and set to system env nothing but its and geting the env so we can acces in applicationport file
		if(dotenv.get("DB_URL")!= null){
			System.setProperty("DB_URL", dotenv.get("DB_URL"));
		}
		if(dotenv.get("DB_USER")!= null){
			System.setProperty("DB_USER", dotenv.get("DB_USER"));
		}
		if(dotenv.get("DB_PASS")!= null){
			System.setProperty("DB_PASS", dotenv.get("DB_PASS"));
		}
		
		
		SpringApplication.run(ChandraHariApplication.class, args);
	}

}
