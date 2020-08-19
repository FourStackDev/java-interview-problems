package org.fourstack.interview.hackerrank;

public class Account implements Comparable<Account>, OnlineAccount {
	private int noOfRegularMoies;
	private int noOfExclusiveMovies;
	private String ownerName;

	public Account(int noOfRegularMoies, int noOfExclusiveMovies, String ownerName) {
		this.noOfRegularMoies = noOfRegularMoies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownerName = ownerName;
	}

	public double monthlyCost() {
		return basePrice + (noOfRegularMoies * regularMoviePrice) + (noOfExclusiveMovies * exclusiveMoviePrice);
	}

	@Override
	public int compareTo(Account otherAccount) {
		Double currentMonthlyCost = this.monthlyCost();
		Double otherMonthlyCost = otherAccount.monthlyCost();

		return currentMonthlyCost.compareTo(otherMonthlyCost);
	}

	@Override
	public String toString() {
		return "\n {Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.}";
	}

}
