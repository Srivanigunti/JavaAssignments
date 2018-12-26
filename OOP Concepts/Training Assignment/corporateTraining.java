public class corporateTraining extends Training {

	public corporateTraining(String subject, int fee) {
		super(subject, fee);
	}

	@Override
	public int getOrderValue() {
		int noOfDays = 5;
		int trainingCharges = noOfDays * getFee();
		return trainingCharges;
	}

}