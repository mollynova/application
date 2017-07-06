package models;
import java.util.ArrayList;
import java.util.*;

public class ItemDB {
	private ArrayList<Item> itemDatabase = new ArrayList<>();
	
	public ItemDB(){
		// Populate the database
		
		// Offensive items
		
		ItemOffensive IO1 = new ItemOffensive("TestIO", 1, 2, 3, 4);
		itemDatabase.add(IO1);
		
		/*
		ItemOffensive IO2 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO2);
		ItemOffensive IO3 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO3);
		ItemOffensive IO4 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO4);
		ItemOffensive IO5 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO5);
		ItemOffensive IO6 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO6);
		ItemOffensive IO7 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO7);
		ItemOffensive IO8 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO8);
		ItemOffensive IO9 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO9);
		ItemOffensive IO10 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO10);
		ItemOffensive IO11 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO11);
		ItemOffensive IO12 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO12);
		ItemOffensive IO13 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO13);
		ItemOffensive IO14 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO14);
		ItemOffensive IO15 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO15);
		ItemOffensive IO16 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO16);
		ItemOffensive IO17 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO17);
		ItemOffensive IO18 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO18);
		ItemOffensive IO19 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO19);
		ItemOffensive IO20 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO20);
		ItemOffensive IO21 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO21);
		ItemOffensive IO22 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO22);
		ItemOffensive IO23 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO23);
		ItemOffensive IO24 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO24);
		ItemOffensive IO25 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO25);
		ItemOffensive IO26 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO26);
		ItemOffensive IO27 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO27);
		ItemOffensive IO28 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO28);
		ItemOffensive IO29 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO29);
		ItemOffensive IO30 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO30);
		ItemOffensive IO31 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO31);
		ItemOffensive IO32 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO32);
		ItemOffensive IO33 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO33);
		ItemOffensive IO34 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO34);
		ItemOffensive IO35 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO35);
		ItemOffensive IO36 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO36);
		ItemOffensive IO37 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO37);
		ItemOffensive IO38 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO38);
		ItemOffensive IO39 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO39);
		ItemOffensive IO40 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO40);
		ItemOffensive IO41 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO41);
		ItemOffensive IO42 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO42);
		ItemOffensive IO43 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO43);
		ItemOffensive IO44 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO44);
		ItemOffensive IO45 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO45);
		ItemOffensive IO46 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO46);
		ItemOffensive IO47 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO47);
		ItemOffensive IO48 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO48);
		ItemOffensive IO49 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO49);
		ItemOffensive IO50 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO50);
		ItemOffensive IO51 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO51);
		ItemOffensive IO52 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO52);
		ItemOffensive IO53 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO53);
		ItemOffensive IO54 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO54);
		ItemOffensive IO55 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO55);
		ItemOffensive IO56 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO56);
		ItemOffensive IO57 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO57);
		ItemOffensive IO58 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO58);
		ItemOffensive IO59 = new ItemOffensive("Name", 0, 0, 0, 0);
		itemDatabase.add(IO59);*/
		
		// Magical Items (80 of these)
		
		ItemMagical IM1 = new ItemMagical("TestIM", 1, 2, 3, 4);
		itemDatabase.add(IM1);
		
		// Defensive Items (86 of these)
		
		ItemDefensive ID1 = new ItemDefensive("TestID", 1, 2, 3, 4);
		itemDatabase.add(ID1);
		
	}
}
