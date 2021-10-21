# Hero-Country SpringBoot API with MySQL - Backend Bootcamp.

This document provides an example of a Hero-Country REST API.

Main features:
- Add/Update/Delete country by ID.
- Add/Update/Delete hero by ID.
- Add/Update/Delete superpower by ID.

# CRUD Methods

## country-controller



| HTTP METHOD | GET              |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | READ       
| ​/api/getCountries      		  | get all countries       
| ​​/api​/getCountryId​/{id}  		 | get all countries by ID 

| HTTP METHOD | CREATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | POST          
| ​​/api​/createCountry   		    | Create a new country

| HTTP METHOD | UPDATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | PUT          
| ​​​/api​/updateCountry​/{id}        | Update country by ID

| HTTP METHOD | DELETE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | DELETE          
| ​​​​/api​/deleteCountry/{id}    	  | Delete country by ID



## hero-controller



| HTTP METHOD | GET              |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | READ        
| ​/api/heroes      		      | Get all heroes
| /api/getHeroesById/{id}        | Get heroes by ID        

| HTTP METHOD | CREATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | POST          
| ​​/api/createHero   	           | Add new heroes

| HTTP METHOD | UPDATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | PUT          
| ​​​/api/updateHero/{id}           | Update hero by ID




## superpower-controller




| HTTP METHOD | GET              |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | READ        
| ​/api/getSuperpowers            | Get all superpowers
| /api/getSuperpowersById/{id}   | Get superpowers by ID        

| HTTP METHOD | CREATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | POST          
| ​​/api/createSuperpowers     	   | Add new superpowers 

| HTTP METHOD | UPDATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	     | PUT          
| ​​​/api/updateSuperpowers /{id}   | Update superpowers  by ID
