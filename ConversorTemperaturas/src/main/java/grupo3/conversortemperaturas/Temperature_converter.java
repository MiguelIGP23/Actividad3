package grupo3.conversortemperaturas;

import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas!\n");
	System.out.print("Introduce temperatura a convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Introduce 1 para convertir de Celsius a Fahrenheit....");
	System.out.println("  Introduce 2 para convertir de Fahrenheit a Celsius....");
	System.out.print("\nIntroduce valor (1 - 2)...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.printf("Tu temperatura convertida es.. %.2f ºF", value1);
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.printf("Tu temperatura convertida es.. %.2f ºC",value3);
		}
	System.out.println("\n\tGracias!!..");
	}
}
