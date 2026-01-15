package com.banco;

import java.util.Scanner;

public class CuentaCorriente {
	private float saldo;
	private float limDesc;
	public String nombre;
	protected String dni;
	public Banco banco;
	
	
	
	public CuentaCorriente (float saldo, String nombre, String dni, float limDesc, Banco banco) {
		this.setSaldo(saldo);
		this.limDesc = limDesc;
		this.nombre = nombre;
		this.dni = dni;
		this.banco = banco;
		
	}
	
	public CuentaCorriente (float saldo, Banco banco) {
		this.limDesc = 0;
		this.setSaldo(saldo);
		this.banco = banco;
	}
	
	public CuentaCorriente (float saldo, String dni, float limDesc) {
		this.limDesc = limDesc;
		this.dni = dni;
		this.setSaldo(saldo);
	}

	public void sacarDinero (float cantidad) {
		if (this.saldo - cantidad >= -limDesc) {
			this.saldo -= cantidad;
			System.out.println("Ha retirado " + cantidad + "€. \n Tiene usted " + saldo + "€");
		} else {
			System.out.println("No es posible realizar la operación: \n\"Límite de descubierto alcanzado\"");
		}
		
	}
	
	public void ingresarDinero (float cantidad) {
		this.setSaldo(this.getSaldo() + cantidad);
	}
	
	public void mostrarInfo () {
		System.out.println("Bienvenido a " + banco.getNombre());
		System.out.println("Capital: " + banco.getCapital());
		System.out.println("Dirección: " + banco.getDireccion());
		System.out.println("Bienvenido, " + this.nombre + "(DNI: (" + this.dni + ")");
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Límite de descubierto: -50€");
		
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	}

	

