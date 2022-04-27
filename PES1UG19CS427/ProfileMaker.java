package PES1UG19CS427;

public class ProfileMaker {
    public void ProfileBuilder(int type) {
        if (type == 1) {
            Resume profile = new Resume();
            profile.printPersonalInformation();
            profile.printProfessionalInformation();
        } else if (type == 2) {
            Portfolio profile = new Portfolio();
            profile.printBioData();
            profile.printSamples();
        }
    }
}
