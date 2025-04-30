package Programacion_orientada_objetos;

import java.util.Scanner;

public class MainAutomoviles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//crear un arrays de automoviles
		Automoviles[] automoviles=new Automoviles[5];
		
		automoviles [0]=new Automoviles("1234AMA", "Modelo1", "Marca1", 2020, 1);
		automoviles [1]=new Automoviles("1234AMB", "Modelo2", "Marca2", 2022, 2);
		automoviles [2]=new Automoviles("1234AMC", "Modelo3", "Marca3", 2019, 1);
		automoviles [3]=new Automoviles("1234AMD", "Modelo4", "Marca4", 1999, 2);
		automoviles [4]=new Automoviles("1234AME", "Modelo5", "Marca5", 1998, 1);

		//ALQUILAR VEHICULOS
		System.out.println("Alquilar un Automovile de categoria 1 por 3 dias" + automoviles[0].alquilar(3));
		System.out.println("Alquilar un Automovile de categoria 2 por 1 dia" + automoviles[1].alquilar(1));
	//INTENTAR ALQUILAR UN VEHICULO YA ALQUILADO 
		
		System.out.println("Intentar un vehiculo nuevamente   " + automoviles[0].alquilar(2));
		
		//DEVOLVER VEHICULO
		automoviles[0].devolver();
		System.out.println("Automovil devuelto");
		
		//CONSULTA LOS VEHICULOS QUE YA ESTAN ALQUILADOS
		System.out.println("Automovil de categoria 1 esta alquilado?" + automoviles[0].estaalquilado());
		System.out.println("Automovil de categoria 2 esta alquilado?" + automoviles[1].estaalquilado());
		
		//ALQUILAR NUEVAMENTE UN AUTOMOVIL
		System.out.println("Arquilar el Automovil de categoria 1 nuevamente por dos dias" + automoviles[0].alquilar(2));
		
	//CONSULTAR GANANCIAS INDIVIDUALES
		System.out.println("Ganancias del Automovil con categoria 1"+ automoviles[0].gananciasind());
	//CONSULTA AUTOMOVILES ALQUILADOS ACTUALMENTE y cuando es un total se llama al arrays
		System.out.println("Automoviles alquilados actuales " + Automoviles.totalvehiculosalq());
	// CONSULTA LAS GANANCIAS TOTALESÇ
		System.out.println("Total de ganancias de vehiculos alquilados hasta el momento " + Automoviles.totalgananciasalq());
	
	}}