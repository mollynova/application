package models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public abstract class Item {
	// members
	
	// Offensive
	private String name;
	private double ad;	// attack damage
	private double as;	// attack speed
	private double csc;	// critical strike chance
	private double ls;	// lifesteal
	
	// Magical
	private double mana;		 
	private double manaRegen; 	// Mana regeneration
	private double ap;			// ability power
	private double cr;			// cooldownreduction
	
	// Defensive
	private double health;	
	private double hr;			// health regeneration
	private double armor;
	private double magicResist;	// magic resistance
	
	// Other
	private double ms;			// movement speed
	
	// constructor
	public Item(String name, double ad, double as, double csc, double ls, double mana, double manaRegen, double ap, double cr,
				double health, double hr, double armor, double magicResist, double ms){
		this.name = name;
		this.ad = ad;
		this.as = as;
		this.csc = csc;
		this.ls = ls;
		this.mana = mana;
		this.manaRegen = manaRegen;
		this.ap = ap;
		this.cr = cr;
		this.health = health;
		this.hr = hr;
		this.armor = armor;
		this.magicResist = magicResist;
		this.ms = ms;
	}


	// methods (getters)
	public String getName(){
		return name;
	}
	
	public double getAd(){
		return ad;
	}
	
	public double getAs(){
		return as;
	}
	
	public double getCsc(){
		return csc;
	}
	
	public double getLs(){
		return ls;
	}
	
	public double getMana(){
		return mana;
	}
	
	public double getManaRegen(){
		return manaRegen;
	}
	
	public double getAp(){
		return ap;
	}
	
	public double getCr(){
		return cr;
	}
	
	public double getHealth(){
		return health;
	}
	
	public double getHr(){
		return hr;
	}
	
	public double getArmor(){
		return armor;
	}
	
	public double getMagicResist(){
		return magicResist;
	}

	public double getMs() {
		return ms;
	}

}

