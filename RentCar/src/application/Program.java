package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		
		try {
			System.out.printf("Entre com os dados do aluguel: %n");
			System.out.print("Modelo do carro: ");
			String nameCar = dados.nextLine();
			System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
			String checkIn = dados.nextLine();
			Date dateIncial = sdf.parse(checkIn);
			System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
			String checkOut = dados.nextLine();
			Date dateFinal = sdf.parse(checkOut);
			System.out.print("Entre com o preço por hora: ");
			Double perHour = dados.nextDouble();
			System.out.print("Entre com o preço por dia: ");
			Double perDay = dados.nextDouble();
			
			 // Calcula a diferença em milissegundos
            long diffInMillies = dateFinal.getTime() - dateIncial.getTime();
            
            // Converte a diferença para dias completos
            long diasEntre = TimeUnit.MILLISECONDS.toDays(diffInMillies);
            
            // Converte o restante em horas
            long horasEntre = TimeUnit.MILLISECONDS.toHours(diffInMillies);
            
            //Preciso arredondar a data 
            System.out.println("Dias entre: " + diasEntre);
            System.out.println("Horas entre: " + horasEntre);
			
			Rent rent = new Rent(nameCar, dateIncial, dateFinal, perHour, perDay);	
			System.out.println(rent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		dados.close();
	}
}
