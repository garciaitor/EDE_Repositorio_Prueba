package CalculadoraPack;
//Comentario
//Comentario 2
//Comentario 3


public class Calculadora {
	private int n1;
	private int n2;
	
	public Calculadora (int a, int b)
	{
		n1 = a;
		n2 = b;
	}
	
	public int suma()
	{
		int result = n1 + n2;
		return result;
	}
	public int resta()
	{
		int result;
		if(resta2()) result = n1 - n2;
		else result = n2 - n1;
		return result;
	}
	public int multiplica()
	{
		int result = n1 * n2;
		return result;
	}
	public int divide()
	{
		int result = n1 / n2;
		return result;
	}
	public boolean resta2() 
	{
		if (n1 >= n2) return true;
		else return false;
	}
	public Integer divide2() 
	{
		if(n2==0) return null;
		int result = n1 / n2;
		return (result);
	}
	public void upperhola() {
		System.out.println("Hola");
	}
}
