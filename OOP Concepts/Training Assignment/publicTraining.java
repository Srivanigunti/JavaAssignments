public class publicTraining extends Training {

	public publicTraining(String subject, int fee) {
		super(subject, fee);
	}

	@Override
	public int getOrderValue() {
		int noOfParticipants=100;
		int trainingCharges = noOfParticipants * getFee();
		return trainingCharges;
	}

}