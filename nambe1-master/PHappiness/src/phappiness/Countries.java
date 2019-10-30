package phappiness;

import java.util.ArrayList;

public class Countries implements Comparable<Countries> {
		
	protected String country;
	protected double gdp;
	protected double socialSupport;
	protected double lifeExpectancy;
	protected double freedom;
	protected double generosity;
	protected double preseptionsOfCorruption;
	protected double dystopia;
	
	public Countries(String country, double gdp, double socialSupport, double lifeExpectancy, double freedom,
		double generosity, double preseptionsOfCorruption, double dystopia) {
		super();
		this.country = country;
		this.gdp = gdp;
		this.socialSupport = socialSupport;
		this.lifeExpectancy = lifeExpectancy;
		this.freedom = freedom;
		this.generosity = generosity;
		this.preseptionsOfCorruption = preseptionsOfCorruption;
		this.dystopia = dystopia;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getGdp() {
		return gdp;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}

	public double getSocialSupport() {
		return socialSupport;
	}

	public void setSocialSupport(double socialSupport) {
		this.socialSupport = socialSupport;
	}

	public double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public double getFreedom() {
		return freedom;
	}

	public void setFreedom(double freedom) {
		this.freedom = freedom;
	}

	public double getGenerosity() {
		return generosity;
	}

	public void setGenerosity(double generosity) {
		this.generosity = generosity;
	}

	public double getPreseptionsOfCorruption() {
		return preseptionsOfCorruption;
	}

	public void setPreseptionsOfCorruption(double preseptionsOfCorruption) {
		this.preseptionsOfCorruption = preseptionsOfCorruption;
	}

	public double getDystopia() {
		return dystopia;
	}

	public void setDystopia(double dystopia) {
		this.dystopia = dystopia;
	}


	public String toString() {
		return "Countries [country=" + country + ", gdp=" + gdp + ", socialSupport=" + socialSupport
				+ ", lifeExpectancy=" + lifeExpectancy + ", freedom=" + freedom + ", generosity=" + generosity
				+ ", preseptionsOfCorruption=" + preseptionsOfCorruption + ", dystopia=" + dystopia + "]";
	}
	
	public int compareTo(Countries c1) {
		// TODO Auto-generated method stub
		return this.country.compareTo(c1.getCountry());
	}
	

}
